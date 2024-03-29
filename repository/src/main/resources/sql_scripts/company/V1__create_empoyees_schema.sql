create table Teams(
    team_id int not null primary key AUTO_INCREMENT,
    name varchar(50),
    project_ref int,
    team_leader varchar(50)
);

create table Projects(
    project_id int not null primary key AUTO_INCREMENT,
    title varchar(50),
    description varchar(200),
    started date,
    ended date,
    client varchar(50),
    project_manager varchar(50),
    delivery_manager varchar(50)
);

create table Employees(
    employee_id int not null primary key AUTO_INCREMENT,
    name varchar(50),
    surname varchar(50),
    age int,
    job_description varchar(50),
    start_work_at time,
    end_work_at time,
    team int,
    project_details int,
    employee_details int
);

create table Employees_details(
    employee_details_id int not null primary key AUTO_INCREMENT,
    passport_id int unique,
    is_married int,
    has_children int,
    location varchar(100),
    study_grade varchar(100)
);

alter table Teams
    add constraint project_ref_project_id_fk
    foreign key (project_ref)
    references Projects(project_id)
    ON UPDATE CASCADE ON DELETE CASCADE;

alter table Employees
    add constraint project_project_id_fk
    foreign key (project_details)
    references Projects(project_id)
    ON UPDATE CASCADE ON DELETE CASCADE;

alter table Employees
    add constraint details_employee_details_id_fk
    foreign key (employee_details)
    references Employees_details(employee_details_id)
    ON UPDATE CASCADE ON DELETE CASCADE;

alter table Employees
    add constraint team_team_id_fk
    foreign key (team)
    references Teams(team_id)
    ON UPDATE CASCADE ON DELETE CASCADE;


