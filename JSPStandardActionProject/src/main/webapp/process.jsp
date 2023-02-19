<%@ page %>

<jsp:useBean id="dto" class="DtoModule.EmployeeDto"  scope="request" />


<jsp:setProperty name='dto' property="*"/>

<jsp:useBean id='service' class='ServiceModule.SalaryDetailsGeneratorImpl' scope='application'/>

<% service.generateSalaryDetails(dto); %>

<table border='1'>

  <tr>
   <th>Employee ID</th>
   <td> <jsp:getProperty property='eno' name='dto'/></td>
   
  </tr>
  
  <tr>
   <th>Employee Name</th>
   <td> <jsp:getProperty property='ename' name='dto'/></td>
   
  </tr>
  
  <tr>
   <th>Employee Salary</th>
   <td> <jsp:getProperty property='bsalary' name='dto'/></td>
   
  </tr>
  
  <tr>
   <th>Gross Salary</th>
   <td> <jsp:getProperty property='grossSalary' name='dto'/></td>
   
  </tr>
  
   <tr>
   <th>Net Salary</th>
   <td> <jsp:getProperty property='netSalary' name='dto'/></td>
   
  </tr>
  
  <a href='./index.html'/>|Home Page|</a>

</table>
