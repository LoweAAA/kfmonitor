$(document).ready(function(){
	getDataByGname("22");
	/*$(".zserver").each(function(i,n){
		$(".state:eq("+i+")").text("2523");
	});*/
});
function getDataByGname(gname){
	// $("#logininfo").text("获取信息中...");
	$.ajax({
		type: "GET",
		url: "/kfmonitor/test.action",
		dataType: "json",
		success: function(data){
			// changeToTable(data);
			setToTable(data);
		},
		error: function(){
			// $("#logininfo").text("请求超时");
		},
	});
}
/*function changeToTable(jsondata){//早期用来测试接口的函数
	$("#logininfo").text("");
	$.each(jsondata,function(i,n){
		var ss;
		if(n["state"]==0){
			ss="维护";
		}else{
			ss="正常";
		}         
		$("#logininfo").append(n["gzone"]+" "+n["zserver"]+" "+ss+"<br>");
		
	});
}*/
function setToTable(jsondata){
	var ss;
	$(".zserver").each(function(zi,zn){
		$.each(jsondata,function(ji,jn){
			if(jn["zserver"].indexOf($(zn).text())>=0){
				if(jn["state"]==0){
					ss="维护";
					$(".state:eq("+zi+")").css("color","red");
				}else{
					ss="正常";
					$(".state:eq("+zi+")").css("color","green");
				}   
				$(".state:eq("+zi+")").text(ss);
			}
			/*$(".state:eq("+i+")").text("2523");*/
		});	
	});
}
