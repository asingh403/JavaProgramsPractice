# LeetCode id : 1179
# Reformat Department Table

Create table If Not Exists Department (id int, revenue int, month varchar(5))
Truncate table Department
insert into Department (id, revenue, month) values ('1', '8000', 'Jan')
insert into Department (id, revenue, month) values ('2', '9000', 'Jan')
insert into Department (id, revenue, month) values ('3', '10000', 'Feb')
insert into Department (id, revenue, month) values ('1', '7000', 'Feb')
insert into Department (id, revenue, month) values ('1', '6000', 'Mar')


# Query Execution

select
id,
coalesce(sum(case when month = "Jan" then revenue end)) as Jan_Revenue,
coalesce(sum(case when month = "Feb" then revenue end)) as Feb_Revenue,
coalesce(sum(case when month = "Mar" then revenue end)) as Mar_Revenue,
coalesce(sum(case when month = "Apr" then revenue end)) as Apr_Revenue,
coalesce(sum(case when month = "May" then revenue end)) as May_Revenue,
coalesce(sum(case when month = "Jun" then revenue end)) as Jun_Revenue,
coalesce(sum(case when month = "Jul" then revenue end)) as Jul_Revenue,
coalesce(sum(case when month = "Aug" then revenue end)) as Aug_Revenue,
coalesce(sum(case when month = "Sep" then revenue end)) as Sep_Revenue,
coalesce(sum(case when month = "Oct" then revenue end)) as Oct_Revenue,
coalesce(sum(case when month = "Nov" then revenue end)) as Nov_Revenue,
coalesce(sum(case when month = "Dec" then revenue end)) as Dec_Revenue
from department
group by id;


