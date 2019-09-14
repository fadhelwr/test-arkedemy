SELECT nama.name, workk.name, category.salary 
FROM nama 
JOIN workk ON workk.id=nama.id_work 
JOIN category ON category.id=nama.id_salary