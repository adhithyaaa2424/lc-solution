# Write your MySQL query statement below
select person_name
from (
    select person_name, turn,
    sum(weight) over(order by turn asc) as total_weight
    from queue
) as cumulative_weight
where total_weight <= 1000 
order by turn desc
limit 1;