/**
 * 创建专题
 */
function createTopic() {
	var title = $("#chuangjian").val().replace(" ", "");
	if (title === undefined || title == '') {
		alert("请输入专题名称。");
		return;
	}

	$.ajax({
		type : "post",
		url : "/topic/create",
		data : {
			topicName : $("#chuangjian").val(),
		},
		dataType : "json",
		success : function(msg) {
			if (msg.status == "OK") {
				jumpto("topic-list");
				$('.left ul li').eq(1).addClass('current').siblings().removeClass("current")
			} else {
				alert("创建专题失败。");
			}
		},
		error : function() {
			alert("数据请求失败。");
		}
	});
}