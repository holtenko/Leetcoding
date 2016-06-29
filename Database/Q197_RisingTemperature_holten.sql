/**
* Created by holten on 2016-06-29.
* Email: holten.ko@gmail.com
*/

# Write your MySQL query statement below
select w1.Id Id from Weather w1, Weather w2 where datediff(w1.Date,w2.Date)=1 and w1.Temperature>w2.Temperature;
