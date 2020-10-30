$(document).ready(function(){
	
	var java=$('#jv').text();
	alert(java);
	if(java!=""){
		$('#jv').on('click',function(){
			$('#quelist').show();
		});
	}else{
		$('#quelist').hide();
	}
});