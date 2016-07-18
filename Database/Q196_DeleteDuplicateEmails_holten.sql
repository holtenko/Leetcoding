/**
* Created by holten on 2016-07-18.
* Email: holten.ko@gmail.com
*/

# Write your MySQL query statement below
delete from Person where Id not in (select Id from (select min(Id) as Id from Person group by Email) tmp);