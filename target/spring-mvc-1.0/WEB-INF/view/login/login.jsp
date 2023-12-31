<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Đăng nhập</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
            <div class="card border-0 shadow rounded-3 my-5">
                <div class="card-body p-4 p-sm-5">
                    <h5 class="card-title text-center mb-5 fw-light fs-5">SIGN IN</h5>

                    <c:if test="${param.incorrectAccount != null}">
                        <div class="alert alert-danger">
                            Username or password incorrect!!
                        </div>
                    </c:if>
                    <c:if test="${param.accessDenied != null}">
                        <div class="alert alert-danger">
                            You do not have access!!
                        </div>
                    </c:if>
                    <form action="j_spring_security_check" id="formLogin"
                          method="POST">
                        <div class="form-floating mb-3">
                            <input type="text" class="form-control" id="userName"
                                   placeholder="Username" name="j_username"> <label
                                for="userName">UserName</label>
                        </div>
                        <div class="form-floating mb-3">
                            <input type="password" class="form-control"
                                   id="floatingPassword" placeholder="passWord" name="j_password">
                            <label for="floatingPassword">Password</label>
                        </div>

                        <div class="form-check mb-3">
                            <input class="form-check-input" type="checkbox" value=""
                                   id="rememberPasswordCheck"> <label
                                class="form-check-label" for="rememberPasswordCheck">
                            Remember password </label>
                        </div>

                        <div class="d-grid">
                            <button class="btn btn-primary btn-login text-uppercase fw-bold"
                                    type="submit">Sign in</button>
                        </div>
                        <hr class="my-4">
                        <div class="d-grid mb-2">
                            <button class="btn btn-google btn-login text-uppercase fw-bold"
                                    type="submit">
                                <i class="fab fa-google me-2"></i> Sign in with Google
                            </button>
                        </div>
                        <div class="d-grid">
                            <button
                                    class="btn btn-facebook btn-login text-uppercase fw-bold"
                                    type="submit">
                                <i class="fab fa-facebook-f me-2"></i> Sign in with Facebook
                            </button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>