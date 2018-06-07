function TestLog() {
	$.ajax({
		type : "POST",
		async: true,
		url  : "../user/all",
		success: function(result) {
			if (result == null || result == "") {
				return;
			}
			//document.body.innerHTML = result[0].userName;
		}
	});		
}
function test1() {
	$.ajax({
		type : "POST",
		async: true,
		url  : "../user/add",
		data : {
			userName:"aaa",
			password:"123123",
			phone:"123123"
		},
		success: function(result) {
			if (result == null || result == "") {
				return;
			}
			if(result==1){
				alert("success");
			}
		}
	});		
}