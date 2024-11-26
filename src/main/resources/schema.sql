CREATE TABLE KEY AUTO_INCREMENT(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    specialization VARCHAR(255)
);

CREATE TABLE project(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    budget DOUBLE
);

CREATE TABLE researcher_project(
    researcherId INT,
    project INT,
    PRIMARY KEY(researcherId,projectId),
    FOREIGN KEY(researcherId) REFERENCES researcher(id),
    FOREIGN KEY(projectId) REFERENCES project(id)
);