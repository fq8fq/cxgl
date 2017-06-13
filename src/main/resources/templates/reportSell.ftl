<!DOCTYPE html>
<html lang="en">

<head>

  <!-- Bootstrap 
    <link href="css/bootstrap.min.css" rel="stylesheet">-->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <meta charset="UTF-8">
</head>

<body>
        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header"align="center",valign="middle">邮政代办车险业务销售统计报表</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading" style="float:right;">
                                               提取日期：2017年1月1日-2017年1月31日  单位：万元、辆
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                  
                                   <tr>
                                   		<th rowspan="2" align="center",valign="middle">"序号"</th>
                                        <th rowspan="2" align="center",valign="middle">省</th>
                                        <th rowspan="2" align="center",valign="middle">地市</th>
                                        <th rowspan="2" align="center",valign="middle">合作保险公司名称</th>
                                        <th colspan="2" align="center",valign="middle">车险保费规模</th>
                                        <th colspan="2" align="center",valign="middle">佣金收入</th>
                                        <th colspan="2" align="center",valign="middle">投保车辆</th>
                                        <th rowspan="2" align="center",valign="middle">合计</th>
                                    </tr>
                                    <tr >
                                   		<th align="center",valign="middle" >当月</th>
                                        <th align="center",valign="middle">累计</th>
                                        <th align="center",valign="middle">当月</th>
                                        <th align="center",valign="middle">累计</th>
                                        <th align="center",valign="middle">当月</th>
                                        <th align="center",valign="middle">累计</th>
                                       
                                    </tr>
                                </thead>
                                <tbody>
                                                                     
                                    <#list report as rep>                                    
                                    <tr class="odd gradeX">
                                        <td>1</td>
                                        <td>内蒙古</td>
                                        <td class="center">${rep.msName}</td>
                                        <td class="center">${rep.bxName}</td>
                                        <td class="center">${rep.cxFee}</td>
                                        <td class="center">X</td>
                                        <td class="center">${rep.yjFee}</td>
                                        <td class="center">X</td>
                                        <td class="center">X</td>
                                        <td class="center">X</td>
                                        <td class="center">X</td>
                                    </tr>
                                    </#list>
                                                                        
                                </tbody>
                            </table>
                            <!-- /.table-responsive -->
                          
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>


    <!-- jQuery -->
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed
    <script src="js/bootstrap.min.js"></script>  -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
  
</body>

</html>
