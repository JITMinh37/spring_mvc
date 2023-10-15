<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/14/2023
  Time: 1:42 PM
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>Admin Home</title>
    <!-- Custom fonts for this template-->
    <link href="<c:url value='/template/admin/vendor/fontawesome-free/css/all.min.css'/>" rel="stylesheet"
          type="text/css">
    <!-- Page level plugin CSS-->
    <link href="<c:url value='/template/admin/vendor/datatables/dataTables.bootstrap4.css'/>" rel="stylesheet">
    <!-- Custom styles for this template-->
    <link href="<c:url value='/template/admin/css/sb-admin.css'/>" rel="stylesheet">
</head>
<body id="page-top">


<%--HEADER--%>
<%@ include file="/common/admin/head.jsp" %>

<dec:body/>


<!-- Bootstrap core JavaScript-->
<script src="<c:url value='/template/admin/vendor/jquery/jquery.min.js'/>"></script>
<script src="<c:url value='/template/admin/vendor/bootstrap/js/bootstrap.bundle.min.js'/>"></script>

<!-- Core plugin JavaScript-->
<script src="<c:url value='/template/admin/vendor/jquery-easing/jquery.easing.min.js'/>"></script>

<!-- Page level plugin JavaScript-->
<script src="<c:url value='/template/admin/vendor/chart.js/Chart.min.js'/>"></script>
<script src="<c:url value='/template/admin/vendor/datatables/jquery.dataTables.js'/>"></script>
<script src="<c:url value='/template/admin/vendor/datatables/dataTables.bootstrap4.js'/>"></script>

<!-- Custom scripts for all pages-->
<script src="<c:url value='/template/admin/js/sb-admin.min.js'/>"></script>

<!-- Demo scripts for this page-->
<script src="<c:url value='/template/admin/js/demo/datatables-demo.js'/>"></script>

<script src="<c:url value='/template/admin/js/demo/chart-area-demo.js'/>"></script>

</body>
</html>
