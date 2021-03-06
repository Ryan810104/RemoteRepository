<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查詢高速公路</title>

<style>
form {
	margin: 0 auto;
	width: 400px;
}

.button {
	display: inline-block;
	text-align: center;
	vertical-align: middle;
	padding: 20px 10px;
	border: 1px solid #170bb8;
	border-radius: 8px;
	background: #3f1eff;
	background: -webkit-gradient(linear, left top, left bottom, from(#3f1eff),
		to(#170bb8));
	background: -moz-linear-gradient(top, #3f1eff, #170bb8);
	background: linear-gradient(to bottom, #3f1eff, #170bb8);
	text-shadow: #0d0666 1px 1px 1px;
	font: normal normal bold 20px arial;
	color: #ffffff;
	text-decoration: none;
}

.button:hover, .button:focus {
	border: 1px solid #190ccc;
	background: #4c24ff;
	background: -webkit-gradient(linear, left top, left bottom, from(#4c24ff),
		to(#1c0ddd));
	background: -moz-linear-gradient(top, #4c24ff, #1c0ddd);
	background: linear-gradient(to bottom, #4c24ff, #1c0ddd);
	color: #ffffff;
	text-decoration: none;
}

.button:active {
	background: #170bb8;
	background: -webkit-gradient(linear, left top, left bottom, from(#170bb8),
		to(#170bb8));
	background: -moz-linear-gradient(top, #170bb8, #170bb8);
	background: linear-gradient(to bottom, #170bb8, #170bb8);
}

.buttonarea {
	padding-left: 50px;
	margin: 0 auto;
}
</style>
</head>


<body>
	<form name="insertHighwayData" action="SearchHighway.do" method="POST">
		<table border='3'>
			<thead>
				<tr bgcolor='tan'>
					<th height="60" colspan="2" align="center">查詢高速公路資料</th>
				</tr>
			</thead>
			<tbody>
				<tr bgcolor='tan'>
					<td width="120" height="40">國道名:</td>
					<td width="400" height="40" align="left"><input
						id='highwaynameid' style="text-align: left" name="nhighwayname"
						type="text" size="15">
						<form>
							<span id="show"></span>
						</form>
						<div style="color: #FF0000; font-size: 60%; display: inline">${ErrorMsg.highwayName}</div>
					</td>
				</tr>


				<tr bgcolor='tan'>
					<td height="50" colspan="2" align="center"><input
						type="submit" value="送出"></td>
				</tr>

			</tbody>
		</table>
		<div style="color: #FF0000; display: inline">${ErrorMsg.exception}</div>
	</form>

	<span class="buttonarea"> 
		<button type="button" value="新增" class="button"
			onclick="javascript:location.href='index.jsp'">新增</button>
		<button type="button" value="修改" class="button"
			onclick="javascript:location.href='UpdatePage.jsp'">修改</button>
		<button type="button" value="刪除" class="button"
			onclick="javascript:location.href='Deletepage.jsp'">刪除</button>
		<button type="button" value="查詢" class="button"
			onclick="javascript:location.href='SearchPage.jsp'">查詢</button>
		<button type="button" value="新增" class="button"
			onclick="javascript:location.href='HomePage.jsp'">回首頁</button>
	</span>
	<script>
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function(){
		if(this.readyState ==4&& this.status==200){
			document.getElementById("show").innerHTML = this.responseText;
		}
	}
	xhttp.open("GET","SelectHighwayName.do",true);
	xhttp.send();
	</script>
</body>
</html>