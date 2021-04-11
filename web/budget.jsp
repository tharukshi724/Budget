<%@ page import="service.budgetService" %>
<%@ page import="model.Budget" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 3/22/2021
  Time: 10:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<<html>
<head>
    <link rel="stylesheet" href="styles/budget.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Budget</title>
</head>
<body>

<div class="container">
    <div class="content">
        <div class="sidebar">
            <ul class="side-nav">

                <li class="side-nav__item side-nav__item--active">
                    <a href="#" class="side-nav__link">
                        <i class="car icon side-nav__icon"></i>
                        <div class="side-nav__text">Service Entry</div>
                    </a>
                </li>

                <li class="side-nav__item">
                    <a href="#" class="side-nav__link">
                        <i class="search icon side-nav__icon"></i>
                        <div class="side-nav__text">Search Entry</div>
                    </a>
                </li>

                <li class="side-nav__item">
                    <a href="#" class="side-nav__link">
                        <i class="tasks icon side-nav__icon"></i>
                        <div class="side-nav__text">Work Progress</div>
                    </a>
                </li>

            </ul>

            <div class="legal">
                &copy; 2021 by RASA. All rights reserved.
            </div>
        </div>

        <div class="main-content">


            <div class="maintitle">
                <h1>Budget</h1>
            </div>

            <button class="report-button">Budget Report</button>

            <form method="post" action="<%=request.getContextPath()%>/budgetServlet">
                <div class="wrapper">
                  <input type="text" class="input" name="month">
                    <button>Month</button>
            </div>
            </form>




            <div class="demo">
                <div class="budget_container">

                    <div class="row">
                        <div class="col-md-4 col-sm-6">
                            <div class="pricingTable">
                                <div class="pricingTable-header">

                                    <h3 class="title">Income</h3>
                                </div>
                                <div class="pricing-content">
                                    <table>
                                        <tr>
                                            <td>Repairs</td>
                                            <td><%=request.getAttribute("Ramount")%></td>

                                        </tr>
                                        <tr>
                                            <td>Rental</td>
                                            <td><%=request.getAttribute("Budget.getRentalAmount()")%></td>
                                        </tr>
                                        </ul>
                                    </table>

                                </div>
                            </div>
                        </div>

                        <div class="col-md-4 col-sm-7">
                            <div class="pricingTable_Pro">
                                <div class="pricingTable-header-pro">

                                    <h3 class="title">Profit</h3>
                                </div>
                                <div class="pricing-content_pro">

                                    <table>
                                        <tr>
                                            <td>Profit</td>
                                            <td>Rs:50000</td>
                                        </tr>


                                    </table>

                                </div>
                            </div>
                        </div>

                        <div class="col-md-4 col-sm-8">
                            <div class="pricingTable_Ex">
                                <div class="pricingTable-header_Ex">

                                    <h3 class="title">Expenses</h3>
                                </div>
                                <div class="pricing-content_Ex">

                                    <table>
                                        <tr>
                                            <td>Payments</td>
                                            <td><%=request.getAttribute("Budget.getEmpPayments()")%></td>
                                        </tr>
                                        <tr>
                                            <td>inventory</td>
                                            <td><%=request.getAttribute("Budget.getInventoryExpenses()")%></td>
                                        </tr>


                                    </table>


                                </div>
                            </div>
                        </div>



                    </div>
                </div>

            </div>

        </div>
    </div>
</div>

</body>
</html>

