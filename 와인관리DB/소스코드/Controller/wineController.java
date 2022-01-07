package mc.sn.wine.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import mc.sn.wine.service.wineService;
import mc.sn.wine.vo.WPVO;
import mc.sn.wine.vo.WTVO;
import mc.sn.wine.vo.buyGrapeVO;
import mc.sn.wine.vo.buyNewFieldVO;
import mc.sn.wine.vo.fieldVO;
import mc.sn.wine.vo.grapeProductionVO;
import mc.sn.wine.vo.inventorySumVO;
import mc.sn.wine.vo.productionSumVO;
import mc.sn.wine.vo.tradeSumVO;
import mc.sn.wine.vo.vineyardVO;
import mc.sn.wine.vo.wineCategoryVO;
import mc.sn.wine.vo.wineGradeVO;
import mc.sn.wine.vo.wineryVO;

@Controller("wineController")
public class wineController {
	@Autowired 
	private wineService service;
	
	@RequestMapping(value = "/field_form", method = RequestMethod.GET)
	public ModelAndView fieldForm(@ModelAttribute("vo") fieldVO vo,HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("fieldForm");
		return mav;		
	}
	
	@ResponseBody
	@RequestMapping(value = "/field_register", method = RequestMethod.POST)
	public void fieldRegister(@ModelAttribute("vo") fieldVO vo,HttpServletRequest request, HttpServletResponse response) throws Exception {
		boolean flag = service.insertField(vo);
		response.getWriter().print(flag);	
	}
	
	@RequestMapping(value = "/vineyard_form", method = RequestMethod.GET)
	public ModelAndView vineyardForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("vineyardForm");
		List<fieldVO> emptyFieldList = new ArrayList<fieldVO>();
		emptyFieldList = service.selectEmptyField();
		mav.addObject("emptyFieldList", emptyFieldList);
		return mav;		
	}
	
	@ResponseBody
	@RequestMapping(value = "/vineyard_register", method = RequestMethod.POST)
	public void vineyardRegister(@ModelAttribute("vo") vineyardVO vo, @RequestParam("checkArr") String fields
	,HttpServletRequest request, HttpServletResponse response) throws Exception {
		String[] id = fields.substring(1,fields.length()-1).split(",");
		boolean flag = service.insertVineyard(vo);
		String vineyard_ID = vo.getVineyard_ID();
		flag = service.updateFieldVineyard_ID(id,vineyard_ID);
		response.getWriter().print(flag);	
	}
	
	@RequestMapping(value = "/winery_form", method = RequestMethod.GET)
	public ModelAndView wineryForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("wineryForm");
		List<vineyardVO> vineyardList = new ArrayList<vineyardVO>();
		vineyardList = service.selectAllVineyard();
		mav.addObject("vineyardList", vineyardList);
		return mav;		
	}
	
	@ResponseBody
	@RequestMapping(value = "/winery_register", method = RequestMethod.POST)
	public void wineryRegister(@ModelAttribute("vo") wineryVO vo,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println(vo);
		boolean flag = service.insertWinery(vo);
		response.getWriter().print(flag);	
	}
	
	@RequestMapping(value = "/wineCategory_form", method = RequestMethod.GET)
	public ModelAndView wineCategoryForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("wineCategoryForm");
		return mav;		
	}
	
	@ResponseBody
	@RequestMapping(value = "/wineCategory_register", method = RequestMethod.POST)
	public void wineCategoryRegister(@ModelAttribute("vo") wineCategoryVO vo,HttpServletRequest request, HttpServletResponse response) throws Exception {
		boolean flag = service.insertWineCategory(vo);
		response.getWriter().print(flag);	
	}
	
	@RequestMapping(value = "/wineGrade_form", method = RequestMethod.GET)
	public ModelAndView wineGradeForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("wineGradeForm");
		return mav;		
	}
	
	@ResponseBody
	@RequestMapping(value = "/wineGrade_register", method = RequestMethod.POST)
	public void wineGradeRegister(@ModelAttribute("vo") wineGradeVO vo,HttpServletRequest request, HttpServletResponse response) throws Exception {
		boolean flag = service.insertWineGrade(vo);
		response.getWriter().print(flag);	
	}
	
	@RequestMapping(value = "/vineyardList", method = RequestMethod.GET)
	public ModelAndView vineyardList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("vineyardList");
		List<vineyardVO> vineyardList = service.selectAllVineyard();
		mav.addObject("vineyardList",vineyardList);
		return mav;		
	}
	
	@RequestMapping(value = "/vineyardChange", method = RequestMethod.GET)
	public ModelAndView vineyardChange(@RequestParam("vineyard_ID") String vineyard_ID,HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("vineyardChange");
		vineyardVO vo = service.selectVineyardById(vineyard_ID);
		mav.addObject("vo",vo);
		return mav;		
	}
	
	@ResponseBody
	@RequestMapping(value = "/vineyardUpdate", method = RequestMethod.POST)
	public void vineyardUpdate(@ModelAttribute("vo") vineyardVO vo,HttpServletRequest request, HttpServletResponse response) throws Exception {
		boolean flag = service.vineyardUpdate(vo);
		response.getWriter().print(flag);	
	}
	
	@RequestMapping(value = "/fieldList", method = RequestMethod.GET)
	public ModelAndView fieldList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("fieldList");
		List<fieldVO> fieldList = service.selectAllfield();
		mav.addObject("fieldList",fieldList);
		return mav;		
	}
	
	@RequestMapping(value = "/fieldDetail", method = RequestMethod.GET)
	public ModelAndView fieldDetail(@RequestParam("field_ID") String field_ID,HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("fieldDetail");
		fieldVO vo = service.selectFieldById(field_ID);
		mav.addObject("vo",vo);
		return mav;		
	}
	
	@RequestMapping(value = "/fieldChange", method = RequestMethod.GET)
	public ModelAndView fieldChange(@RequestParam("field_ID") String field_ID, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("fieldChange");
		fieldVO vo = service.selectFieldById(field_ID);
		mav.addObject("vo",vo);
		return mav;		
	}
	
	@ResponseBody
	@RequestMapping(value = "/fieldUpdate", method = RequestMethod.POST)
	public void fieldUpdate(@ModelAttribute("vo") fieldVO vo,HttpServletRequest request, HttpServletResponse response) throws Exception {
		boolean flag = service.fieldUpdate(vo);
		response.getWriter().print(flag);	
	}
	
	@ResponseBody
	@RequestMapping(value = "/GrapeProduction_form", method = RequestMethod.GET)
	public ModelAndView GrapeProduction(@RequestParam("field_ID") String field_ID,HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("GrapeProductionForm");
		mav.addObject("field_ID",field_ID);
		return mav;		
	}
	
	@ResponseBody
	@RequestMapping(value = "/grapeProduction_register", method = RequestMethod.POST)
	public void grapeProductionRegister(@ModelAttribute("vo") grapeProductionVO vo,HttpServletRequest request, HttpServletResponse response) throws Exception {
		boolean flag = service.insertGrapeProduction(vo);
		response.getWriter().print(flag);
	}
	
	@RequestMapping(value = "/buyNewField_form", method = RequestMethod.GET)
	public ModelAndView buyNewFieldForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("buyNewFieldForm");
		List<fieldVO> emptyFieldList = service.selectEmptyField();
		List<vineyardVO> vineyardList = service.selectAllVineyard();
		mav.addObject("emptyFieldList", emptyFieldList);
		mav.addObject("vineyardList", vineyardList);
		return mav;		
	}
	
	@ResponseBody
	@RequestMapping(value = "/buyNewField_register", method = RequestMethod.POST)
	public void buyNewFieldRegister(@ModelAttribute("vo") buyNewFieldVO vo,
	HttpServletRequest request, HttpServletResponse response) throws Exception {
		boolean flag = service.buyNewField(vo);
		response.getWriter().print(flag);	
	}
	
	@RequestMapping(value = "/GPList", method = RequestMethod.GET)
	public ModelAndView GPList(@RequestParam("field_ID")String field_ID, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("GPList");
		List<grapeProductionVO> GPList = service.selectGPByField(field_ID);
		mav.addObject("GPList",GPList);
		return mav;		
	}
	
	@RequestMapping(value = "/GP_changeForm", method = RequestMethod.GET)
	public ModelAndView GPChangeForm(@RequestParam("GP_ID") String GP_ID,HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("GPChangeForm");
		grapeProductionVO vo = service.selectGPByGPID(GP_ID);
		mav.addObject("vo", vo);
		return mav;	
	}
	
	@ResponseBody
	@RequestMapping(value = "/GP_update", method = RequestMethod.POST)
	public void GPUpdate(@ModelAttribute("vo") grapeProductionVO vo,HttpServletRequest request, HttpServletResponse response) throws Exception {
		boolean flag = service.GPUpdate(vo);
		response.getWriter().print(flag);	
	}
	
	@RequestMapping(value = "/wineryList", method = RequestMethod.GET)
	public ModelAndView wineryList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("wineryList");
		List<wineryVO> wineryList = service.selectAllWinery();
		mav.addObject("wineryList",wineryList);
		return mav;		
	}
	
	@RequestMapping(value = "/winery_changeForm", method = RequestMethod.GET)
	public ModelAndView wineryChangeForm(@RequestParam("winery_ID") String winery_ID,HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("wineryChangeForm");
		wineryVO vo = service.selectWineyrById(winery_ID);
		mav.addObject("vo", vo);
		return mav;	
	}
	
	@ResponseBody
	@RequestMapping(value = "/winery_update", method = RequestMethod.POST)
	public void GPUpdate(@ModelAttribute("vo") wineryVO vo,HttpServletRequest request, HttpServletResponse response) throws Exception {
		boolean flag = service.wineryUpdate(vo);
		response.getWriter().print(flag);	
	}
	
	@RequestMapping(value = "/winery_detail", method = RequestMethod.GET)
	public ModelAndView wineryDetail(@RequestParam("winery_ID") String winery_ID,HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("wineryDetail");
		LocalDate now = LocalDate.now();
		String year = Integer.toString(now.getYear());
		
		wineryVO vo = service.selectWineyrById(winery_ID);
		List<tradeSumVO> tradeSumList = service.selectTradeSumByID(winery_ID);
		List<productionSumVO> productionSumList = service.selectProductSumByID(winery_ID);
		List<inventorySumVO> inventorySumList = service.selectInventorySumByID(winery_ID);
		List<productionSumVO> productionSumList2 = service.selectProductSumByYear(year);
		List<tradeSumVO> tradeSumList2 = service.selectTradeSumByYear(year);
		mav.addObject("vo", vo);
		mav.addObject("tradeSumList", tradeSumList);
		mav.addObject("productionSumList", productionSumList);
		mav.addObject("inventorySumList", inventorySumList);
		mav.addObject("productionSumList2", productionSumList2);
		mav.addObject("tradeSumList2", tradeSumList2);
		return mav;	
	}
	
	@ResponseBody
	@RequestMapping(value = "/WP_register", method = RequestMethod.POST)
	public void wineCategoryRegister(@ModelAttribute("vo") WPVO vo,HttpServletRequest request, HttpServletResponse response) throws Exception {
		boolean flag = service.insertWP(vo);
		response.getWriter().print(flag);	
	}
	
	@ResponseBody
	@RequestMapping(value = "/WT_register", method = RequestMethod.POST)
	public void wineCategoryRegister(@ModelAttribute("vo") WTVO vo,HttpServletRequest request, HttpServletResponse response) throws Exception {
		boolean flag = service.insertWT(vo);
		response.getWriter().print(flag);	
	}
	
	@RequestMapping(value = "/buyNewGrapeForm", method = RequestMethod.GET)
	public ModelAndView buyNewGrapeForm(@RequestParam("winery_ID") String winery_ID,HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("buyNewGrapeForm");
		wineryVO winery = service.selectWineyrById(winery_ID);
		vineyardVO vineyard = service.selectvineyardByWineryId(winery_ID);
		mav.addObject("winery", winery);
		mav.addObject("vineyard", vineyard);
		mav.addObject("winery_ID",winery_ID);
		return mav;	
	}
	
	@ResponseBody
	@RequestMapping(value = "/buyGrape", method = RequestMethod.POST)
	public void buyGrape(@ModelAttribute("vo") buyGrapeVO vo,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println(vo);
		boolean flag = service.buyGrape(vo);
		response.getWriter().print(flag);	
	}
	
	@RequestMapping(value = "/WPChange", method = RequestMethod.GET)
	public ModelAndView WPChange(@RequestParam("winery_ID") String winery_ID,HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("WPChange");
		List<WPVO> WPList = service.selectWPByWineryId(winery_ID);
		mav.addObject("WPList",WPList);
		mav.addObject("winery_ID", winery_ID);
		return mav;	
	}
	
	@RequestMapping(value = "/WTChange", method = RequestMethod.GET)
	public ModelAndView WTChange(@RequestParam("winery_ID") String winery_ID,HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("WTChange");
		List<WTVO> WTList = service.selectWTByWineryId(winery_ID);
		mav.addObject("WTList",WTList);
		mav.addObject("winery_ID", winery_ID);
		return mav;	
	}
	
	@RequestMapping(value = "/WPChangeForm", method = RequestMethod.GET)
	public ModelAndView WPChangeForm(@RequestParam("winery_ID") String winery_ID,
			@RequestParam("WP_ID") String WP_ID
			,HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("WPChangeForm");
		WPVO vo = service.selectWPById(WP_ID);
		mav.addObject("vo",vo);
		mav.addObject("winery_ID", winery_ID);
		return mav;	
	}
	
	@RequestMapping(value = "/WTChangeForm", method = RequestMethod.GET)
	public ModelAndView WTChangeForm(@RequestParam("winery_ID") String winery_ID,
			@RequestParam("WT_ID") String WT_ID
			,HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("WTChangeForm");
		WTVO vo = service.selectWTById(WT_ID);
		mav.addObject("vo",vo);
		mav.addObject("winery_ID", winery_ID);
		return mav;	
	}
	
	@ResponseBody
	@RequestMapping(value = "/WP_update", method = RequestMethod.POST)
	public void GPUpdate(@ModelAttribute("vo") WPVO vo,HttpServletRequest request, HttpServletResponse response) throws Exception {
		boolean flag = service.WPUpdate(vo);
		response.getWriter().print(flag);	
	}
	
	@ResponseBody
	@RequestMapping(value = "/WT_update", method = RequestMethod.POST)
	public void GPUpdate(@ModelAttribute("vo") WTVO vo,HttpServletRequest request, HttpServletResponse response) throws Exception {
		boolean flag = service.WTUpdate(vo);
		response.getWriter().print(flag);	
	}
	
	@RequestMapping(value = "/mainPage", method = RequestMethod.GET)
	public ModelAndView mainPage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mainPage");
		return mav;	
	}
	
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public ModelAndView input(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("input");
		return mav;	
	}
	
	@RequestMapping(value = "/manageVineyard", method = RequestMethod.GET)
	public ModelAndView manageVineyard(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("manageVineyard");
		return mav;	
	}
	
	@RequestMapping(value = "/manageWinery", method = RequestMethod.GET)
	public ModelAndView manageWinery(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("manageWinery");
		return mav;	
	}
	
	//포도농장 통계 요약정보
	@RequestMapping(value = "/vineyardSummary", method = RequestMethod.GET)
	public ModelAndView vineyardSummary(@RequestParam("vineyard_ID") String vineyard_ID,HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("vineyardSummary");
		int totalArea = service.vineyardTotalArea(vineyard_ID);
		int totalGP = service.vineyardTotalGP(vineyard_ID);
		int totalGT = service.vineyardTotalGT(vineyard_ID);
		mav.addObject("totalArea", totalArea);
		mav.addObject("totalGP", totalGP);
		mav.addObject("totalGT", totalGT);
		return mav;		
	}
	
	// vineyard 상세 정보
	@RequestMapping(value = "/vineyard_detail", method = RequestMethod.GET)
	public ModelAndView vineyardDetail(@RequestParam("vineyard_ID") String vineyard_ID,HttpServletRequest request, HttpServletResponse response) throws Exception {
		LocalDate now = LocalDate.now();
		String year = Integer.toString(now.getYear());
		ModelAndView mav = new ModelAndView();
		mav.setViewName("vineyardDetail");
		vineyardVO vo = service.selectVineyardById(vineyard_ID);
		grapeProductionVO vo1 = service.thisYearGP(vineyard_ID,year);
		List<fieldVO> fieldList = service.selectFieldByVineyard(vineyard_ID);
		mav.addObject("vo", vo);
		mav.addObject("vo1", vo1);
		mav.addObject("fieldList", fieldList);
		return mav;	
	}
	
	// GP 등록
	@RequestMapping(value = "/WPForm", method = RequestMethod.GET)
	public ModelAndView WPForm(@RequestParam("winery_ID") String winery_ID,HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("WPForm");
		mav.addObject("winery_ID", winery_ID);
		return mav;		
	}
	
	@RequestMapping(value = "/WTForm", method = RequestMethod.GET)
	public ModelAndView WTForm(@RequestParam("winery_ID") String winery_ID,HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("WTForm");
		mav.addObject("winery_ID", winery_ID);
		return mav;		
	}
	
	//와이너리 통계정보 요약??????????????????
	@RequestMapping(value = "/winery_summary", method = RequestMethod.GET)
	public ModelAndView winerySummary(@RequestParam("winery_ID") String winery_ID,HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("winerySummary");
		productionSumVO totalWP = service.sumAllWP(winery_ID);
		tradeSumVO totalWT = service.sumAllWT(winery_ID);
		mav.addObject("totalWP", totalWP);
		mav.addObject("totalWT", totalWT);
		return mav;		
	}
	
}