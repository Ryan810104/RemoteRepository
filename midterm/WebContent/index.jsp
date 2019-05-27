<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首頁</title>
<script>
	document.addEventListener("DOMContentLoaded", function() {
		document.getElementById("highwaynameid").addEventListener("blur",
				checkhighwayName);
		document.getElementById("numberid").addEventListener("blur",
				checknumber);
		document.getElementById("codeid").addEventListener("blur", checkcode);
		document.getElementById("startpointid").addEventListener("blur",
				startpoint);
		document.getElementById("endpointid")
				.addEventListener("blur", endpoint);
		document.getElementById("milechargeid").addEventListener("blur",
				milecharge);
		document.getElementById("chargesmallcarid").addEventListener("blur",
				chargesmallcar);
		document.getElementById("chargebigcarid").addEventListener("blur",
				chargebigcar);
		document.getElementById("chargetruckid").addEventListener("blur",
				chargetruck);
	});

	function checkhighwayName() {
		let road = document.getElementById("highwaynameid").value;
		if (road.length != 0) {
			document.getElementById("checkHighwayName").innerHTML = "<img src='Images/check.png'>";
		} else if (road.length == 0) {
			document.getElementById("checkHighwayName").innerHTML = "<img src='Images/error.png'>";
			document.getElementById("highwaynameid").style.backgroundColor = "lightblue";
		}
	}

	function checknumber() {
		let direct = document.getElementById("numberid").value;
		if (direct.length != 0) {
			document.getElementById("checknumber").innerHTML = "<img src='Images/check.png'>";
		} else if (direct.length == 0) {
			document.getElementById("checknumber").innerHTML = "<img src='Images/error.png'>";
			document.getElementById("numberid").style.backgroundColor = "lightblue";
		}
	}

	function checkcode() {
		let code = document.getElementById("codeid").value;
		if (code.length != 0) {
			document.getElementById("checkcode").innerHTML = "<img src='Images/check.png'>";
		} else if (code.length == 0) {
			document.getElementById("checkcode").innerHTML = "<img src='Images/error.png'>";
			document.getElementById("codeid").style.backgroundColor = "lightblue";
		}
	}

	function startpoint() {
		let startpoint = document.getElementById("startpointid").value;
		if (startpoint.length != 0) {
			document.getElementById("checkstartpoint").innerHTML = "<img src='Images/check.png'>";
		} else if (startpoint.length == 0) {
			document.getElementById("checkstartpoint").innerHTML = "<img src='Images/error.png'>";
			document.getElementById("startpointid").style.backgroundColor = "lightblue";
		}
	}
	function endpoint() {
		let endpoint = document.getElementById("endpointid").value;
		if (endpoint.length != 0) {
			document.getElementById("checkendpoint").innerHTML = "<img src='Images/check.png'>";
		} else if (endpoint.length == 0) {
			document.getElementById("checkendpoint").innerHTML = "<img src='Images/error.png'>";
			document.getElementById("endpointid").style.backgroundColor = "lightblue";
		}
	}

	function milecharge() {
		let milecharge = document.getElementById("milechargeid").value;
		if (milecharge.length != 0) {
			document.getElementById("checkmilecharge").innerHTML = "<img src='Images/check.png'>";
		} else if (milecharge.length == 0) {
			document.getElementById("checkmilecharge").innerHTML = "<img src='Images/error.png'>";
			document.getElementById("milechargeid").style.backgroundColor = "lightblue";
		}
	}

	function chargesmallcar() {
		let chargesmallcar = document.getElementById("chargesmallcarid").value;
		if (chargesmallcar.length != 0) {
			document.getElementById("checkchargesmallcar").innerHTML = "<img src='Images/check.png'>";
		} else if (chargesmallcar.length == 0) {
			document.getElementById("checkchargesmallcar").innerHTML = "<img src='Images/error.png'>";
			document.getElementById("chargesmallcarid").style.backgroundColor = "lightblue";
		}
	}
	function chargebigcar() {
		let chargebigcar = document.getElementById("chargebigcarid").value;
		if (chargebigcar.length != 0) {
			document.getElementById("checkchargebigcar").innerHTML = "<img src='Images/check.png'>";
		} else if (chargebigcar.length == 0) {
			document.getElementById("checkchargebigcar").innerHTML = "<img src='Images/error.png'>";
			document.getElementById("chargebigcarid").style.backgroundColor = "lightblue";
		}
	}

	function chargetruck() {
		let chargetruck = document.getElementById("chargetruckid").value;
		if (chargetruck.length != 0) {
			document.getElementById("checkchargetruck").innerHTML = "<img src='Images/check.png'>";
		} else if (chargetruck.length == 0) {
			document.getElementById("checkchargetruck").innerHTML = "<img src='Images/error.png'>";
			document.getElementById("chargetruckid").style.backgroundColor = "lightblue";
		}
	}
</script>
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
	<form name="insertHighwayData" action="Highway.do" method="POST">
		<table border='3'>
			<thead>
				<tr bgcolor='tan'>
					<th height="60" colspan="2" align="center">新增高速公路資料</th>
				</tr>
			</thead>
			<tbody>
				<tr bgcolor='tan'>
					<td width="120" height="40">國道名:</td>
					<td width="400" height="40" align="left"><input
						id='highwaynameid' style="text-align: left" name="nhighwayname"
						type="text" size="15"> <span id="checkHighwayName"></span>
						<div style="color: #FF0000; font-size: 60%; display: inline">${ErrorMsg.highwayName}</div>
					</td>
				</tr>
				<tr bgcolor='tan'>
					<td width="120" height="40">方向:</td>
					<td width="400" height="40" align="left">
						<!-- 				<input id='directid' --> <!-- 					style="text-align: left" name="ndirect" type="text" size="1"> -->
						<select name="ndirect" id='directid'>
							<option value="N">N</option>
							<option value="E">E</option>
							<option value="S">S</option>
							<option value="W">W</option>
					</select>
						<div style="color: #FF0000; font-size: 60%; display: inline">${ErrorMsg.direct}</div>
					</td>
				</tr>
				<tr bgcolor='tan'>
					<td width="120" height="40">編號:</td>
					<td width="400" height="40" align="left"><input name="nnumber"
						id='numberid' type="text" size="12"> <span
						id="checknumber"></span>
						<p style="font-size: 80%; color: blue;">格式範例為00F-000.0N</p>
						<div style="color: #FF0000; font-size: 60%; display: inline">${ErrorMsg.number}</div>
					</td>
				</tr>
				<tr bgcolor='tan'>
					<td width="120" height="40">收費區代碼:</td>
					<td width="200" height="40" align="left"><input name="ncode"
						id='codeid' type="text" size="12"> <span id="checkcode"></span>
						<p style="font-size: 80%; color: blue;">格式範例為00F0000N</p>
						<div style="color: #FF0000; font-size: x-small; display: inline">${ErrorMsg.code}</div>
					</td>
				</tr>
				<tr bgcolor='tan'>
					<td width="120" height="40">起點交流道:</td>
					<td width="400" height="40" align="left"><input
						id='startpointid' name="nstartPoint" type="text" size="30">
						<span id="checkstartpoint"></span>
						<div style="color: #FF0000; font-size: x-small; display: inline">${ErrorMsg.startpoint}</div>
					</td>
				</tr>
				<tr bgcolor='tan'>
					<td width="120" height="40">迄點交流道:</td>
					<td width="400" height="40" align="left"><input
						id='endpointid' name="nendpoint" type="text" size="30"> <span
						id="checkendpoint"></span>
						<div style="color: #FF0000; font-size: x-small; display: inline">${ErrorMsg.endpoint}</div>
					</td>
				</tr>
				<tr bgcolor='tan'>
					<td width="120" height="40">收費區設定里程:</td>
					<td width="400" height="40" align="left"><input
						id='milechargeid' name="nmilecharge" type="text" size="5">
						<span id="checkmilecharge"></span>
						<div style="color: #FF0000; font-size: x-small; display: inline">${ErrorMsg.milecharge}</div>
					</td>
				</tr>
				<tr bgcolor='tan'>
					<td width="120" height="40">小型車牌價:</td>
					<td width="400" height="40" align="left"><input
						id='chargesmallcarid' name="nchargesmallcar" type="text" size="5">
						<span id="checkchargesmallcar"></span>
						<div style="color: #FF0000; font-size: x-small; display: inline">${ErrorMsg.chargesmallcar}</div>
					</td>
				</tr>
				<tr bgcolor='tan'>
					<td width="120" height="40">大型車牌價:</td>
					<td width="400" height="40" align="left"><input
						id='chargebigcarid' name="nchargebigcar" type="text" size="5">
						<span id="checkchargebigcar"></span>
						<div style="color: #FF0000; font-size: x-small; display: inline">${ErrorMsg.chargebigcar}</div>
					</td>
				</tr>
				<tr bgcolor='tan'>
					<td width="120" height="40">聯結車牌價:</td>
					<td width="400" height="40" align="left"><input
						id='chargetruckid' name="nchargetruck" type="text" size="5">
						<span id="checkchargetruck"></span>
						<div style="color: #FF0000; font-size: x-small; display: inline">${ErrorMsg.chargetruck}</div>
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
	<button type="button" value="新增" class="button" onclick="javascript:location.href='index.jsp'">新增</button>
	<button type="button" value="修改" class="button" onclick="javascript:location.href='UpdatePage.jsp'">修改</button>
	<button type="button" value="刪除" class="button" onclick="javascript:location.href='Deletepage.jsp'">刪除</button>
	<button type="button" value="查詢" class="button" onclick="javascript:location.href='SearchPage.jsp'">查詢</button>
	<button type="button" value="新增" class="button" onclick="javascript:location.href='HomePage.jsp'">回首頁</button>
	</span>
</body>
</html>