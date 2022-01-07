package mc.sn.wine.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mc.sn.wine.vo.WPVO;
import mc.sn.wine.vo.WTVO;
import mc.sn.wine.vo.buyGrapeVO;
import mc.sn.wine.vo.buyNewFieldVO;
import mc.sn.wine.vo.fieldVO;
import mc.sn.wine.vo.grapeProductionVO;
import mc.sn.wine.vo.inventorySumVO;
import mc.sn.wine.vo.productionSumVO;
import mc.sn.wine.vo.tradeSumVO;
import mc.sn.wine.vo.vineyardTotalVO;
import mc.sn.wine.vo.vineyardVO;
import mc.sn.wine.vo.wineCategoryVO;
import mc.sn.wine.vo.wineGradeVO;
import mc.sn.wine.vo.wineryVO;

@Repository("wineDAO")
public class wineDAO {
	
	@Autowired
	private SqlSession sqlSession;

	public boolean insertField(fieldVO vo) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int a = sqlSession.insert("mapper.member.insertField",vo);
		if(a>0) {
			flag = true;
		}
		return flag;
	}

	public boolean insertVineyard(vineyardVO vo) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int a = sqlSession.insert("mapper.member.insertVineyard",vo);
		if(a>0) {
			flag = true;
		}
		return flag;
	}

	public boolean insertWinery(wineryVO vo) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int a = sqlSession.insert("mapper.member.insertWinery",vo);
		if(a>0) {
			flag = true;
		}
		return flag;
	}

	public boolean insertWineCategory(wineCategoryVO vo) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int a = sqlSession.insert("mapper.member.insertWineCategory",vo);
		if(a>0) {
			flag = true;
		}
		return flag;
	}

	public boolean insertWineGrade(wineGradeVO vo) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int a = sqlSession.insert("mapper.member.insertWineGrade",vo);
		if(a>0) {
			flag = true;
		}
		return flag;
	}
	
	public List<fieldVO> selectEmptyField() {
		// TODO Auto-generated method stub
		List<fieldVO> fieldList = new ArrayList<fieldVO>();		
		fieldList = sqlSession.selectList("mapper.member.selectEmptyField");
		/*
		 * for(MemberVO vo : memberList) { System.out.println(vo); }
		 */
		return fieldList;
	}

	public boolean updateFieldVineyard_ID(String[] id, String vineyard_ID) {
		// TODO Auto-generated method stub
		boolean flag = true;
		for(int i=0;i<id.length;i++) {
			HashMap<String,String> map = new HashMap<String,String>();
			map.put("field_ID",id[i].substring(1, id[i].length()-1));
			map.put("vineyard_ID",vineyard_ID);
			int a = sqlSession.update("mapper.member.updateFieldVineyardID",map);
			if(a>0) {
				flag = true;
			}
		}
		return flag;
	}

	public List<vineyardVO> selectAllVineyard() {
		// TODO Auto-generated method stub
		List<vineyardVO> vineyardList = new ArrayList<vineyardVO>();		
		vineyardList = sqlSession.selectList("mapper.member.selectAllVineyard");
		return vineyardList;
	}

	public vineyardVO selectVineyardById(String vineyard_ID) {
		// TODO Auto-generated method stub
		vineyardVO vo = sqlSession.selectOne("mapper.member.selectVineyardById",vineyard_ID);
		return vo;
	}

	public boolean vineyardUpdate(vineyardVO vo) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int a = sqlSession.update("mapper.member.vineyardUpdateById",vo);
		if(a>0) {
			flag = true;
		}
		return flag;
	}

	public fieldVO selectFieldById(String field_ID) {
		// TODO Auto-generated method stub
		fieldVO vo = sqlSession.selectOne("mapper.member.selectFieldById",field_ID);
		return vo;
	}

	public boolean fieldUpdate(fieldVO vo) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int a = sqlSession.update("mapper.member.fieldUpdateById", vo);
		if(a>0) {
			flag = true;
		}
		return flag;
	}

	public List<fieldVO> selectAllfield() {
		// TODO Auto-generated method stub
		List<fieldVO> fieldList = new ArrayList<fieldVO>();		
		fieldList = sqlSession.selectList("mapper.member.selectAllfield");
		return fieldList;
	}

	public boolean insertGrapeProduction(grapeProductionVO vo) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int a = sqlSession.insert("mapper.member.insertGP",vo);
		if(a>0) {
			flag = true;
		}
		return flag;
	}

	public List<grapeProductionVO> selectGPByField(String field_ID) {
		// TODO Auto-generated method stub
		List<grapeProductionVO> GPList = new ArrayList<grapeProductionVO>();		
		GPList = sqlSession.selectList("mapper.member.selectGPByField",field_ID);
		return GPList;
	}

	public grapeProductionVO selectByGPID(String GP_ID) {
		// TODO Auto-generated method stub
		grapeProductionVO vo = sqlSession.selectOne("mapper.member.selectByGPID",GP_ID);
		return vo;
	}

	public boolean GPUpdate(grapeProductionVO vo) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int a = sqlSession.update("mapper.member.GPUpdate",vo);
		if(a>0) {
			flag = true;
		}
		return flag;
	}

	public wineryVO selectWineyrById(String winery_ID) {
		// TODO Auto-generated method stub
		wineryVO vo = sqlSession.selectOne("mapper.member.selectWineyrById",winery_ID);
		return vo;
	}

	public List<wineryVO> selectAllWinery() {
		// TODO Auto-generated method stub
		List<wineryVO> wineryList = new ArrayList<wineryVO>();		
		wineryList = sqlSession.selectList("mapper.member.selectAllWinery");
		return wineryList;
	}

	public boolean wineryUpdate(wineryVO vo) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int a = sqlSession.update("mapper.member.wineryUpdate",vo);
		if(a>0) {
			flag = true;
		}
		return flag;
	}

	public List<tradeSumVO> selectTradeSumByID(String winery_ID) {
		// TODO Auto-generated method stub
		List<tradeSumVO> list = new ArrayList<tradeSumVO>();		
		list = sqlSession.selectList("mapper.member.selectTradeSumByID",winery_ID);
		return list;
	}

	public List<productionSumVO> selectProductSumByID(String winery_ID) {
		// TODO Auto-generated method stub
		List<productionSumVO> list = new ArrayList<productionSumVO>();		
		list = sqlSession.selectList("mapper.member.selectProductSumByID",winery_ID);
		return list;
	}

	public List<inventorySumVO> selectInventorySumByID(String winery_ID) {
		// TODO Auto-generated method stub
		List<inventorySumVO> list = new ArrayList<inventorySumVO>();		
		list = sqlSession.selectList("mapper.member.selectInventorySumByID",winery_ID);
		return list;
	}

	public List<productionSumVO> selectProductSumByYear(String year) {
		// TODO Auto-generated method stub
		List<productionSumVO> list = new ArrayList<productionSumVO>();		
		list = sqlSession.selectList("mapper.member.selectProductSumByYear",year);
		return list;
	}

	public List<tradeSumVO> selectTradeSumByYear(String year) {
		// TODO Auto-generated method stub
		List<tradeSumVO> list = new ArrayList<tradeSumVO>();		
		list = sqlSession.selectList("mapper.member.selectTradeSumByYear",year);
		return list;
	}

	public boolean insertWP(WPVO vo) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int a = sqlSession.insert("mapper.member.insertWP",vo);
		int b = sqlSession.insert("mapper.member.insertWI",vo);
		if(b>0) {
			flag = true;
		}
		return flag;
	}

	public boolean insertWT(WTVO vo) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int a = sqlSession.insert("mapper.member.insertWT",vo);
		int b = sqlSession.insert("mapper.member.insertWI1",vo);
		if(b>0) {
			flag = true;
		}
		return flag;
	}

	public vineyardVO selectvineyardByWineryId(String winery_ID) {
		// TODO Auto-generated method stub
		vineyardVO vo = sqlSession.selectOne("mapper.member.selectvineyardByWineryId", winery_ID);
		return vo;
	}

	public boolean buyGrape(buyGrapeVO vo) {
		// TODO Auto-generated method stub
		boolean flag= false;
		int a = sqlSession.update("mapper.member.sellGrape",vo);
		int b = sqlSession.update("mapper.member.buyGrape",vo);
		if(b>0) {
			flag= true;
		}
		return flag;
	}

	public List<WPVO> selectWPByWineryId(String winery_ID) {
		// TODO Auto-generated method stub
		List<WPVO> list = new ArrayList<WPVO>();		
		list = sqlSession.selectList("mapper.member.selectWPByWineryId",winery_ID);
		return list;
	}

	public List<WTVO> selectWTByWineryId(String winery_ID) {
		// TODO Auto-generated method stub
		List<WTVO> list = new ArrayList<WTVO>();		
		list = sqlSession.selectList("mapper.member.selectWTByWineryId",winery_ID);
		return list;
	}

	public WPVO selectWPById(String wP_ID) {
		// TODO Auto-generated method stub
		WPVO vo = sqlSession.selectOne("mapper.member.selectWPById",wP_ID);
		return vo;
	}
	
	public WTVO selectWTById(String wT_ID) {
		// TODO Auto-generated method stub
		WTVO vo = sqlSession.selectOne("mapper.member.selectWTById",wT_ID);
		return vo;
	}

	public boolean WPUpdate(WPVO vo) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int a = sqlSession.update("mapper.member.WPUpdate",vo);
		if(a>0) {
			flag = true;
		}
		return flag;
	}

	public boolean WTUpdate(WTVO vo) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int a = sqlSession.update("mapper.member.WTUpdate",vo);
		if(a>0) {
			flag = true;
		}
		return flag;
	}

	public int vineyardTotalArea(String vineyard_ID) {
		// TODO Auto-generated method stub
		vineyardTotalVO vo = sqlSession.selectOne("mapper.member.vineyardTotalArea",vineyard_ID);
		int totalArea = 0;
		if(vo==null) {
			return totalArea;
		} else {
			return vo.getTotalArea();
		}
	}

	public int vineyardTotalGP(String vineyard_ID) {
		// TODO Auto-generated method stub
		vineyardTotalVO vo = sqlSession.selectOne("mapper.member.vineyardTotalGP",vineyard_ID);
		int totalGP = 0;
		if(vo==null) {
			return totalGP;
		} else {
			return vo.getTotalGP();
		}
	}

	public int vineyardTotalGT(String vineyard_ID) {
		// TODO Auto-generated method stub
		vineyardTotalVO vo = sqlSession.selectOne("mapper.member.vineyardTotalGT",vineyard_ID);
		int totalGT = 0;
		if(vo==null) {
			return totalGT;
		} else {
			return vo.getTotalGT();
		}
	}

	public grapeProductionVO thisYearGP(String vineyard_ID, String year) {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("year",year);
		map.put("vineyard_ID",vineyard_ID);
		grapeProductionVO vo = sqlSession.selectOne("mapper.member.thisYearGP",map);
		return vo;
	}

	public List<fieldVO> selectFieldByVineyard(String vineyard_ID) {
		// TODO Auto-generated method stub
		List<fieldVO> list = new ArrayList<fieldVO>();		
		list = sqlSession.selectList("mapper.member.selectFieldByVineyard",vineyard_ID);
		return list;
	}

	public boolean buyNewField(buyNewFieldVO vo) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int a = sqlSession.update("mapper.member.sellField",vo);
		int b = sqlSession.update("mapper.member.buyField",vo);
		if(b>0) {
			flag = true;
		}
		return flag;
	}

	public productionSumVO sumAllWP(String winery_ID) {
		// TODO Auto-generated method stub
		productionSumVO vo = sqlSession.selectOne("mapper.member.sumAllWP", winery_ID);
		return vo;
	}

	public tradeSumVO sumAllWT(String winery_ID) {
		// TODO Auto-generated method stub
		tradeSumVO vo = sqlSession.selectOne("mapper.member.sumAllWT", winery_ID);
		return vo;
	}

	/*
	 * public MemberVO selectById(String id) { // TODO Auto-generated method stub
	 * MemberVO vo = sqlSession.selectOne("mapper.member.selectById",id); return vo;
	 * }
	 */
}
