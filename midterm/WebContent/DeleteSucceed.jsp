<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

     .button {
    display: inline-block;
    text-align: center;
    vertical-align: middle;
    padding: 20px 10px;
    border: 1px solid #170bb8;
    border-radius: 8px;
    background: #3f1eff;
    background: -webkit-gradient(linear, left top, left bottom, from(#3f1eff), to(#170bb8));
    background: -moz-linear-gradient(top, #3f1eff, #170bb8);
    background: linear-gradient(to bottom, #3f1eff, #170bb8);
    text-shadow: #0d0666 1px 1px 1px;
    font: normal normal bold 20px arial;
    color: #ffffff;
    text-decoration: none;
}
.button:hover,
.button:focus {
    border: 1px solid #190ccc;
    background: #4c24ff;
    background: -webkit-gradient(linear, left top, left bottom, from(#4c24ff), to(#1c0ddd));
    background: -moz-linear-gradient(top, #4c24ff, #1c0ddd);
    background: linear-gradient(to bottom, #4c24ff, #1c0ddd);
    color: #ffffff;
    text-decoration: none;
}
.button:active {
    background: #170bb8;
    background: -webkit-gradient(linear, left top, left bottom, from(#170bb8), to(#170bb8));
    background: -moz-linear-gradient(top, #170bb8, #170bb8);
    background: linear-gradient(to bottom, #170bb8, #170bb8);
}
.buttonarea{

padding-left:100px;
margin:0 480px;
}
</style>
</head>
<body>
<h2 style="font-family:微軟正黑體;font-color:gray;font-size:20px;">資料刪除成功</h2>
<span class="buttonarea">
	<button type="button" value="新增" class="button" onclick="javascript:location.href='index.jsp'">新增</button>
	<button type="button" value="修改" class="button" onclick="javascript:location.href='UpdatePage.jsp'">修改</button>
	<button type="button" value="刪除" class="button" onclick="javascript:location.href='Deletepage.jsp'">刪除</button>
	<button type="button" value="查詢" class="button" onclick="javascript:location.href='SearchPage.jsp'">查詢</button>
	<button type="button" value="新增" class="button" onclick="javascript:location.href='HomePage.jsp'">回首頁</button>
	</span>
</body>
</html>