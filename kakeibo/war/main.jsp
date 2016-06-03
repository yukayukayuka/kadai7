<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>みんなの家計簿</title>
</head>
<body bgcolor="#ffa07a">
    <font face="メイリオ">
<h1>家計簿入力</h1>


    <p>詳細内容</p>
 <input type="text" name="use"> 
    <p>金額</p>
<input type="int" name="price">
<input type="submit" value="支出" name="submit">
<input type="submit" value="収入" name="submit">
</form>
<c:if test="${not empty errorMsg}">
<p>${errorMsg}</p>
</c:if>

</body>
</html>