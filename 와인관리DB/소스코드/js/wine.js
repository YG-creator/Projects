$(document).ready(function(){
    $('#fieldRegister').click(function(){
        var field_ID = $('#field_ID').val();
        var location = $('#location').val();
        var area = $('#area').val();
        var variety = $('#variety').val();
        var flag = false;
	        $.ajax({
				data :  {"field_ID" : field_ID, "location" : location,"area" : area, "variety" : variety},
				type : "post",
				dataType: "text",
				async: false,
				url : './field_register',     						
				success : function(data, textStatus){
		            if (eval(data)==true){
						flag = true;
						alert("등록하였습니다."); 
		                window.location.assign('/wine/field_form'); 
		            } else{
		                alert("다시 입력해주세요.");
		            }
				},
				error : function(data, textStatus){
				},
				complete : function(data,textStatus){
					
				}
			});
		
		return flag;
	})
	
	$('#vineyardRegister').click(function(){
        var vineyard_ID = $('#vineyard_ID').val(); 
        var owner = $('#owner').val(); 
        var address = $('#address').val(); 
        var tel_number = $('#tel_number').val(); 
        var inv_white = 0;
        var inv_red = 0;
        var money = $('#money').val(); 
        var flag = false;
        var checkArr = [];     // 배열 초기화
        $("input:checkbox[name=field]:checked").each(function(){
			checkArr.push($(this).val())
		});
		//alert(checkArr);
        
	        $.ajax({
				data :  {"vineyard_ID" : vineyard_ID, "owner" : owner,"address" : address, "tel_number" : tel_number, 
				"inv_white" : inv_white, "inv_red" : inv_red, "money" : money, "checkArr" : JSON.stringify(checkArr)},
				type : "post",
				dataType: "text",
				async: false,
				url : './vineyard_register',     						
				success : function(data, textStatus){
		            if (eval(data)==true){
						flag = true;
						alert("등록하였습니다.");
		                window.location.assign('./vineyard_form'); 
		            } else{
		                alert("다시 입력해주세요.");
		            }
				},
				error : function(data, textStatus){
				},
				complete : function(data,textStatus){
					
				}
			});
		
		return flag;
	})
	
	$('#wineCategoryRegister').click(function(){
        var category_ID = $('#category_ID').val();
        var title = $('#title').val();
        var standardPrice = $('#standardPrice').val();
        var flag = false;
        
	        $.ajax({
				data :  {"category_ID" : category_ID, "title" : title,"standardPrice" : standardPrice},
				type : "post",
				dataType: "text",
				async: false,
				url : '/wine/wineCategory_register',     						
				success : function(data, textStatus){
		            if (eval(data)==true){
						flag = true;
						alert("등록하였습니다.");
		                window.location.assign('/wine/wineCategory_form');
		            } else{
		                alert("다시 입력해주세요.");
		            }
				},
				error : function(data, textStatus){
				},
				complete : function(data,textStatus){
					
				}
			});
		
		return flag;
	})
	
	$('#wineGradeRegister').click(function(){
        var grade_ID = $('#grade_ID').val();
        var title = $('#title').val();
        var ratio = $('#ratio').val();
        var flag = false;
        
	        $.ajax({
				data :  {"grade_ID" : grade_ID, "title" : title, "ratio" : ratio},
				type : "post",
				dataType: "text",
				async: false,
				url : '/wine/wineGrade_register',     						
				success : function(data, textStatus){
		            if (eval(data)==true){
						flag = true;
						alert("등록하였습니다.");
		                window.location.assign('/wine/wineGrade_form');
		            } else{
		                alert("다시 입력해주세요.");
		            }
				},
				error : function(data, textStatus){
				},
				complete : function(data,textStatus){
					
				}
			});
		
		return flag;
	})
	
	$('#wineryRegister').click(function(){
        var winery_ID = $('#winery_ID').val(); 
        var owner = $('#owner').val(); 
        var address = $('#address').val(); 
        var tel_number = $('#tel_number').val(); 
        var inv_white = 0; 
        var inv_red = 0; 
        var money = $('#money').val(); 
        var grade_ID = $('#grade_ID').val(); 
        var vineyard_ID = $('input[name="vineyard"]:checked').val();
        var flag = false;
        
	        $.ajax({
				data :  {"winery_ID" : winery_ID, "owner" : owner,"address" : address, "tel_number" : tel_number, 
				"inv_white" : inv_white, "inv_red" : inv_red, "money" : money, "grade_ID" : grade_ID, "vineyard_ID" : vineyard_ID},
				type : "post",
				dataType: "text",
				async: false,
				url : './winery_register',     						
				success : function(data, textStatus){
		            if (eval(data)==true){
						flag = true;
						alert("등록하였습니다."); //요거는 됨
		                window.location.assign('./winery_form');  // 요게 안됨  
		            } else{
		                alert("다시 입력해주세요.");
		            }
				},
				error : function(data, textStatus){
				},
				complete : function(data,textStatus){
					
				}
			});
		
		return flag;
	})
	
	$('#vineyardUpdate').click(function(){
        var vineyard_ID = $('#vineyard_ID').val(); 
        var owner = $('#owner').val(); 
        var address = $('#address').val(); 
        var tel_number = $('#tel_number').val(); 
        var inv_white = $('#inv_white').val(); 
        var inv_red = $('#inv_red').val(); 
        var money = $('#money').val(); 
        var flag = false;
        
        $.ajax({
			data :  {"vineyard_ID" : vineyard_ID, "owner" : owner,"address" : address, "tel_number" : tel_number, 
			"inv_white" : inv_white, "inv_red" : inv_red, "money" : money},
			type : "post",
			dataType: "text",
			async: false,
			url : './vineyardUpdate',     						
			success : function(data, textStatus){
	            if (eval(data)==true){
					flag = true;
					alert("수정하였습니다."); 
	                window.location.assign('./vineyard_detail?vineyard_ID='+vineyard_ID);  
	            } else{
	                alert("다시 입력해주세요.");
	            }
			},
			error : function(data, textStatus){
			},
			complete : function(data,textStatus){
				
			}
		});
		
		return flag;
	})
	
	$('#fieldUpdate').click(function(){
        var field_ID = $('#field_ID').val(); 
        var location = $('#location').val(); 
        var area = $('#area').val(); 
        var variety = $('#variety').val(); 
        var vineyard_ID = $('#vineyard_ID').val(); 
        var flag = false;
        
	        $.ajax({
				data :  {"field_ID" : field_ID, "location" : location, "area" : area, 
				"variety" : variety, "vineyard_ID" : vineyard_ID},
				type : "post",
				dataType: "text",
				async: false,
				url : './fieldUpdate',     						
				success : function(data, textStatus){
		            if (eval(data)==true){
						flag = true;
						alert("수정하였습니다."); //요거는 됨
		                window.location.assign('./fieldList');  // 요게 안됨  
		            } else{
		                alert("다시 입력해주세요.");
		            }
				},
				error : function(data, textStatus){
				},
				complete : function(data,textStatus){
					
				}
			});
		
		return flag;
	})
	
	$('#grapeProductionRegister').click(function(){
        var gp_ID = $('#GP_ID').val(); 
        var year = $('#year').val(); 
        var amount = $('#amount').val(); 
        var field_ID = $('#field_ID').text(); 
        var flag = false;
        
	        $.ajax({
				data :  {"GP_ID" : gp_ID, "year" : year,"amount" : amount, "field_ID" : field_ID},
				type : "post",
				dataType: "text",
				async: false,
				url : './grapeProduction_register',     						
				success : function(data, textStatus){
		            if (eval(data)==true){
						flag = true;
						alert("등록하였습니다."); //요거는 됨
		                window.location.assign('./fieldList');  // 요게 안됨  
		            } else{
		                alert("다시 입력해주세요.");
		            }
				},
				error : function(data, textStatus){
				},
				complete : function(data,textStatus){
					
				}
			});
		
		return flag;
	})
	
	$('#buyNewFieldsRegister').click(function(){
		var field_ID = $('input[name="field"]:checked').val();
        var vineyard_ID = $('input[name="vineyard"]:checked').val();
        var flag = false;
        
        
	        $.ajax({
				data :  {"vineyard_ID" : vineyard_ID, "field_ID" : field_ID},
				type : "post",
				dataType: "text",
				async: false,
				url : './buyNewField_register',     						
				success : function(data, textStatus){
		            if (eval(data)==true){
						flag = true;
						alert("구매하였습니다.");
		                window.location.assign('./buyNewField_form'); 
		            } else{
		                alert("다시 입력해주세요.");
		            }
				},
				error : function(data, textStatus){
				},
				complete : function(data,textStatus){
					
				}
			});
		
		return flag;
	})
	
	$('#GP_update').click(function(){
        var gp_ID = $('#GP_ID').val(); 
        var year = $('#year').val(); 
        var amount = $('#amount').val(); 
        var field_ID = $('#field_ID').val(); 
        var flag = false;
        
	        $.ajax({
				data :  {"GP_ID" : gp_ID, "year" : year,"amount" : amount, "field_ID" : field_ID},
				type : "post",
				dataType: "text",
				async: false,
				url : './GP_update',     						
				success : function(data, textStatus){
		            if (eval(data)==true){
						flag = true;
						alert("수정하였습니다."); //요거는 됨
		                window.location.assign('./fieldList');  
		            } else{
		                alert("다시 입력해주세요.");
		            }
				},
				error : function(data, textStatus){
				},
				complete : function(data,textStatus){
					
				}
			});
		
		return flag;
	})
	
	$('#winery_update').click(function(){
        var winery_ID = $('#winery_ID').val(); 
        var owner = $('#owner').val(); 
        var address = $('#address').val(); 
        var tel_number = $('#tel_number').val(); 
        var inv_white = $('#inv_white').val(); 
        var inv_red = $('#inv_red').val(); 
        var money = $('#money').val(); 
        var grade_ID = $('#grade_ID').val(); 
        var vineyard_ID = $('#vineyard_ID').val(); 
        var flag = false;
        
	        $.ajax({
				data :  {"winery_ID" : winery_ID, "owner" : owner,"address" : address,"tel_number" : tel_number, 
				"inv_white" : inv_white,"inv_red" : inv_red,"money" : money,"grade_ID" : grade_ID,"vineyard_ID" : vineyard_ID,},
				type : "post",
				dataType: "text",
				async: false,
				url : './winery_update',     						
				success : function(data, textStatus){
		            if (eval(data)==true){
						flag = true;
						alert("수정하였습니다."); //요거는 됨
		                window.location.assign('./wineryList');  
		            } else{
		                alert("다시 입력해주세요.");
		            }
				},
				error : function(data, textStatus){
				},
				complete : function(data,textStatus){
					
				}
			});
		
		return flag;
	})
	
	$('#WPRegister').click(function(){
        var wP_ID = $('#WP_ID').val();
        var category_ID = $('#category_ID').val();
        var year = $('#year').val();
        var amount = $('#amount').val();
        var winery_ID = $('#winery_ID').val();
        var flag = false;
        
	        $.ajax({
				data :  {"WP_ID" : wP_ID, "category_ID" : category_ID, "year" : year,"amount" : amount,"winery_ID" : winery_ID},
				type : "post",
				dataType: "text",
				async: false,
				url : './WP_register',     						
				success : function(data, textStatus){
		            if (eval(data)==true){
						flag = true;
						alert("등록하였습니다.");
		                window.location.assign('./wineryList');
		            } else{
		                alert("다시 입력해주세요.");
		            }
				},
				error : function(data, textStatus){
				},
				complete : function(data,textStatus){
					
				}
			});
		
		return flag;
	})
	
	$('#WTRegister').click(function(){
        var wT_ID = $('#WT_ID').val();
        var category_ID = $('#category_ID').val();
        var year = $('#year').val();
        var amount = $('#amount').val();
        var winery_ID = $('#winery_ID').val();
        var flag = false;
        
	        $.ajax({
				data :  {"WT_ID" : wT_ID, "category_ID" : category_ID, "year" : year,"amount" : amount,"winery_ID" : winery_ID},
				type : "post",
				dataType: "text",
				async: false,
				url : './WT_register',     						
				success : function(data, textStatus){
		            if (eval(data)==true){
						flag = true;
						alert("등록하였습니다.");
		                window.location.assign('./wineryList');
		            } else{
		                alert("다시 입력해주세요.");
		            }
				},
				error : function(data, textStatus){
				},
				complete : function(data,textStatus){
					
				}
			});
		
		return flag;
	})
	
	$('#buyGrape').click(function(){
        var inv_white = $('#inv_white').val(); 
        if(inv_white==""){
			inv_white=0;
		}
        var inv_red = $('#inv_red').val(); 
        if(inv_red==""){
			inv_red=0;
		}
        var winery_ID = $('#winery_ID').val(); 
        var flag = false;
        
	        $.ajax({
				data :  {"inv_white" : inv_white, "inv_red" : inv_red,"winery_ID" : winery_ID},
				type : "post",
				async: false,
				url : './buyGrape',     						
				success : function(data, textStatus){
		            if (eval(data)==true){
						flag = true;
						alert("구매하였습니다.");
		                window.location.assign('./buyNewGrapeForm?winery_ID='+winery_ID); 
		            } else{
		                alert("다시 입력해주세요.");
		            }
				},
				error : function(data, textStatus){
				},
				complete : function(data,textStatus){
					
				}
			});
		
		return flag;
	})
	
	$('#WPUpdate').click(function(){
        var wP_ID = $('#WP_ID').val(); 
        var category_ID = $('#category_ID').val(); 
        var year = $('#year').val(); 
        var amount = $('#amount').val(); 
        var winery_ID = $('#winery_ID').val(); 
        var flag = false;
        
	        $.ajax({
				data :  {"WP_ID" : wP_ID, "category_ID" : category_ID,"year" : year,"amount" : amount, "winery_ID" : winery_ID},
				type : "post",
				dataType: "text",
				async: false,
				url : './WP_update',     						
				success : function(data, textStatus){
		            if (eval(data)==true){
						flag = true;
						alert("수정하였습니다."); //요거는 됨
		                window.location.assign('./WPChange?winery_ID='+winery_ID);  
		            } else{
		                alert("다시 입력해주세요.");
		            }
				},
				error : function(data, textStatus){
				},
				complete : function(data,textStatus){
					
				}
			});
		
		return flag;
	})
	
	$('#WTUpdate').click(function(){
        var wT_ID = $('#WT_ID').val(); 
        var category_ID = $('#category_ID').val(); 
        var year = $('#year').val(); 
        var amount = $('#amount').val(); 
        var winery_ID = $('#winery_ID').val(); 
        var flag = false;
        
	        $.ajax({
				data :  {"WT_ID" : wT_ID, "category_ID" : category_ID,"year" : year,"amount" : amount, "winery_ID" : winery_ID},
				type : "post",
				dataType: "text",
				async: false,
				url : './WT_update',     						
				success : function(data, textStatus){
		            if (eval(data)==true){
						flag = true;
						alert("수정하였습니다."); //요거는 됨
		                window.location.assign('./WTChange?winery_ID='+winery_ID);  
		            } else{
		                alert("다시 입력해주세요.");
		            }
				},
				error : function(data, textStatus){
				},
				complete : function(data,textStatus){
					
				}
			});
		
		return flag;
	})
})