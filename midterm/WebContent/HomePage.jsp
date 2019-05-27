<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.allpage {
	width: 800px;
	height:atuo;
	margin:200px auto;
	border: 1px solid rgb(128, 128, 128);
	border-top-left-radius: 10px;
	border-top-right-radius: 10px;
	border-bottom-right-radius: 10px;
	border-bottom-left-radius: 10px;
	background-color: rgb(219, 181, 122);
}

 fieldset {
            width: 500px;
            height:auto;
            border-radius: 1em;
            margin: 10px auto;
        }
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
padding-top:250px;

padding-left:100px;
}
        
</style>
</head>
<body>
	<div class="allpage">
	<section>
	<form action="#" method="POST">
	<fieldset>
	<legend style="font-family:微軟正黑體;font-color:gray;font-size:20px;">新增、刪除、修改、查詢</legend>
	<span class="buttonarea">
	<button type="button" value="新增" class="button" onclick="javascript:location.href='index.jsp'">新增</button>
	<button type="button" value="修改" class="button" onclick="javascript:location.href='UpdatePage.jsp'">修改</button>
	<button type="button" value="刪除" class="button" onclick="javascript:location.href='Deletepage.jsp'">刪除</button>
	<button type="button" value="查詢" class="button" onclick="javascript:location.href='SearchPage.jsp'">查詢</button>
	</span>
	</fieldset>
	</form>
	</section>
	</div>

</body>
</html>