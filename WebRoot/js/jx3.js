function getDataByGname(gname){
	$("#logininfo").text("获取信息中...");
	$.ajax({
    	type: "GET",
        url: "/kfmonitor/test.action",
             dataType: "json",
             success: function(data){
             		   $("#logininfo").text("");
                       $.each(data,function(i,n){
                       var ss;
    				   if(n["state"]==0){
    				   	ss="维护";
    				   }else{
    				   	ss="正常";
    				   }         
                       $("#logininfo").append(n["gzone"]+" "+n["zserver"]+" "+ss+"<br>");
                       
                       });
                       console.log(typeof data);
                      },
             error: function(){
             	$("#logininfo").text("请求超时");
             },
     });
}
$(document).ready(function(){
	getDataByGname("22");
});