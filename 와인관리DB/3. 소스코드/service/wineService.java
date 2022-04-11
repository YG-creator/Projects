package mc.sn.wine.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.sn.wine.dao.wineDAO;
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

@Service("wineService")
public class wineService {
	
	@Autowired
	private wineDAO dao;

	public boolean insertField(fieldVO vo) {
		// TODO Auto-generated method stub
		boolean flag = dao.insertField(vo);
		return flag;
	}

	public boolean insertVineyard(vineyardVO vo) {
		// TODO Auto-generated method stub
		boolean flag = dao.insertVineyard(vo);
		return flag;
	}

	public boolean insertWinery(wineryVO vo) {
		// TODO Auto-generated method stub
		boolean flag = dao.insertWinery(vo);
		return flag;
	}

	public boolean insertWineCategory(wineCategoryVO vo) {
		// TODO Auto-generated method stub
		boolean flag = dao.insertWineCategory(vo);
		return flag;
	}

	public boolean insertWineGrade(wineGradeVO vo) {
		// TODO Auto-generated method stub
		boolean flag = dao.insertWineGrade(vo);
		return flag;
	}
	
	public List<fieldVO> selectEmptyField() {
		// TODO Auto-generated method stub
		List<fieldVO> fieldList = new ArrayList<fieldVO>();		
		fieldList = dao.selectEmptyField();
		return fieldList;
	}

	public boolean updateFieldVineyard_ID(String[] id, String vineyard_ID) {
		// TODO Auto-generated method stub
		boolean flag = dao.updateFieldVineyard_ID(id,vineyard_ID);
		return flag;
	}

	public List<vineyardVO> selectAllVineyard() {
		// TODO Auto-generated method stub
		List<vineyardVO> vineyardList = new ArrayList<vineyardVO>();		
		vineyardList = dao.selectAllVineyard();
		return vineyardList;
	}

	public vineyardVO selectVineyardById(String vineyard_ID) {
		// TODO Auto-generated method stub
		vineyardVO vo = dao.selectVineyardById(vineyard_ID);
		return vo;
	}

	public boolean vineyardUpdate(vineyardVO vo) {
		// TODO Auto-generated method stub
		boolean flag = dao.vineyardUpdate(vo);
		return flag;
	}

	public fieldVO selectFieldById(String field_ID) {
		// TODO Auto-generated method stub
		fieldVO vo = dao.selectFieldById(field_ID);
		return vo;
	}

	public boolean fieldUpdate(fieldVO vo) {
		// TODO Auto-generated method stub
		boolean flag = dao.fieldUpdate(vo);
		return flag;
	}

	public List<fieldVO> selectAllfield() {
		// TODO Auto-generated method stub
		List<fieldVO> fieldList = new ArrayList<fieldVO>();		
		fieldList = dao.selectAllfield();
		return fieldList;
	}

	public boolean insertGrapeProduction(grapeProductionVO vo) {
		// TODO Auto-generated method stub
		boolean flag = dao.insertGrapeProduction(vo);
		return flag;
	}

	public List<grapeProductionVO> selectGPByField(String field_ID) {
		// TODO Auto-generated method stub
		List<grapeProductionVO> GPList = dao.selectGPByField(field_ID);	
		return GPList;
	}

	public grapeProductionVO selectGPByGPID(String GP_ID) {
		// TODO Auto-generated method stub
		grapeProductionVO vo = dao.selectByGPID(GP_ID);
		return vo;
	}

	public boolean GPUpdate(grapeProductionVO vo) {
		// TODO Auto-generated method stub
		boolean flag = dao.GPUpdate(vo);
		return flag;
	}

	public wineryVO selectWineyrById(String winery_ID) {
		// TODO Auto-generated method stub
		wineryVO vo = dao.selectWineyrById(winery_ID);
		return vo;
	}

	public List<wineryVO> selectAllWinery() {
		// TODO Auto-generated method stub
		List<wineryVO> wineryList = new ArrayList<wineryVO>();		
		wineryList = dao.selectAllWinery();
		return wineryList;
	}

	public boolean wineryUpdate(wineryVO vo) {
		// TODO Auto-generated method stub
		boolean flag = dao.wineryUpdate(vo);
		return flag;
	}

	public List<tradeSumVO> selectTradeSumByID(String winery_ID) {
		// TODO Auto-generated method stub
		List<tradeSumVO> list = dao.selectTradeSumByID(winery_ID);
		return list;
	}

	public List<productionSumVO> selectProductSumByID(String winery_ID) {
		// TODO Auto-generated method stub
		List<productionSumVO> list = dao.selectProductSumByID(winery_ID);
		return list;
	}

	public List<inventorySumVO> selectInventorySumByID(String winery_ID) {
		// TODO Auto-generated method stub
		List<inventorySumVO> list = dao.selectInventorySumByID(winery_ID);
		return list;
	}

	public List<productionSumVO> selectProductSumByYear(String year) {
		// TODO Auto-generated method stub
		List<productionSumVO> list = dao.selectProductSumByYear(year);
		return list;
	}

	public List<tradeSumVO> selectTradeSumByYear(String year) {
		// TODO Auto-generated method stub
		List<tradeSumVO> list = dao.selectTradeSumByYear(year);
		return list;
	}

	public boolean insertWP(WPVO vo) {
		// TODO Auto-generated method stub
		boolean flag = dao.insertWP(vo);
		return flag;
	}

	public boolean insertWT(WTVO vo) {
		// TODO Auto-generated method stub
		boolean flag = dao.insertWT(vo);
		return flag;
	}

	public vineyardVO selectvineyardByWineryId(String winery_ID) {
		// TODO Auto-generated method stub
		vineyardVO vo = dao.selectvineyardByWineryId(winery_ID);
		return vo;
	}

	public boolean buyGrape(buyGrapeVO vo) {
		// TODO Auto-generated method stub
		boolean flag = dao.buyGrape(vo);
		return flag;
	}

	public List<WPVO> selectWPByWineryId(String winery_ID) {
		// TODO Auto-generated method stub
		List<WPVO> list = dao.selectWPByWineryId(winery_ID);
		return list;
	}

	public List<WTVO> selectWTByWineryId(String winery_ID) {
		// TODO Auto-generated method stub
		List<WTVO> list = dao.selectWTByWineryId(winery_ID);
		return list;
	}

	public WPVO selectWPById(String wP_ID) {
		// TODO Auto-generated method stub
		WPVO vo = dao.selectWPById(wP_ID);
		return vo;
	}
	
	public WTVO selectWTById(String wT_ID) {
		// TODO Auto-generated method stub
		WTVO vo = dao.selectWTById(wT_ID);
		return vo;
	}

	public boolean WPUpdate(WPVO vo) {
		// TODO Auto-generated method stub
		boolean flag = dao.WPUpdate(vo);
		return flag;
	}

	public boolean WTUpdate(WTVO vo) {
		// TODO Auto-generated method stub
		boolean flag = dao.WTUpdate(vo);
		return flag;
	}

	public int vineyardTotalArea(String vineyard_ID) {
		// TODO Auto-generated method stub
		int totalArea = dao.vineyardTotalArea(vineyard_ID);
		return totalArea;
	}

	public int vineyardTotalGP(String vineyard_ID) {
		// TODO Auto-generated method stub
		int totalGP = dao.vineyardTotalGP(vineyard_ID);
		return totalGP;
	}

	public int vineyardTotalGT(String vineyard_ID) {
		// TODO Auto-generated method stub
		int totalGT = dao.vineyardTotalGT(vineyard_ID);
		return totalGT;
	}

	public grapeProductionVO thisYearGP(String vineyard_ID, String year) {
		// TODO Auto-generated method stub
		grapeProductionVO vo = dao.thisYearGP(vineyard_ID,year);
		return vo;
	}

	public List<fieldVO> selectFieldByVineyard(String vineyard_ID) {
		// TODO Auto-generated method stub
		List<fieldVO> list = dao.selectFieldByVineyard(vineyard_ID);
		return list;
	}

	public boolean buyNewField(buyNewFieldVO vo) {
		// TODO Auto-generated method stub
		boolean flag = dao.buyNewField(vo);
		return flag;
	}

	public productionSumVO sumAllWP(String winery_ID) {
		// TODO Auto-generated method stub
		productionSumVO vo = dao.sumAllWP(winery_ID);
		return vo;
	}

	public tradeSumVO sumAllWT(String winery_ID) {
		// TODO Auto-generated method stub
		tradeSumVO vo = dao.sumAllWT(winery_ID);
		return vo;
	}
}
