create database nba;

\c nba ;


create table joueurs (
    id serial primary key,
    nom varchar(100),
    prenom varchar(100),
    taille decimal,
    poids decimal
);

create table equipes (
    id serial primary key,
    nom varchar(100),
    coach varchar(100)
);

create table joueur_equipe (
    id serial primary key,
    joueur INT REFERENCES joueurs(id),
    equipe INT REFERENCES equipes(id)
);

INSERT INTO joueur_equipe (joueur, equipe) VALUES
(1, 1),
(2, 2);-- Équipe 1 (Golden State Warriors)

create view coequipier as 
select j.nom as nom_joueur ,
       j.prenom ,
       j.taille ,
       j.poids ,
       j.id as id_joueur ,
       e.nom as nom_equipe ,
       e.id as id_equipe
from joueur_equipe je 
    join equipes e on je.equipe = e.id 
    join joueurs j on je.joueur = j.id;
    


INSERT INTO joueurs (nom, prenom, taille, poids) VALUES
('Durant', 'Kevin', 208, 109),
('Curry', 'Stephen', 191, 86),
('Thompson', 'Klay', 201, 98),
('Green', 'Draymond', 201, 104),
('Iguodala', 'Andre', 198, 98),

('James', 'LeBron', 206, 113),
('Davis', 'Anthony', 208, 113),
('Westbrook', 'Russell', 191, 91),
('Howard', 'Dwight', 211, 120),
('Monk', 'Malik', 196, 92),

('Antetokounmpo', 'Giannis', 211, 109),
('Holiday', 'Jrue', 193, 96),
('Middleton', 'Khris', 201, 102),
('Lopez', 'Brook', 213, 122),
('Portis', 'Bobby', 206, 111), 

('Harden', 'James', 196, 100),
('Irving', 'Kyrie', 193, 88),
('Durant', 'Kevin', 208, 109),
('Griffin', 'Blake', 208, 113),
('Aldridge', 'LaMarcus', 211, 117);


INSERT INTO equipes (nom, coach) VALUES
('Golden State Warriors', 'Steve Kerr'),
('Los Angeles Lakers', 'Frank Vogel'),
('Milwaukee Bucks', 'Mike Budenholzer'),
('Brooklyn Nets', 'Steve Nash');

-- Insérer de nouveaux joueurs dans la table joueur_equipe (IDs de joueur commençant par 6)



select*from joueur_equipe je 
    join equipes e on je.equipe = e.id 
    join joueurs j on je.joueur = j.id;


  

create table match (
    id serial primary key,
    lieu varchar(100),
    date timestamp
);

create table match_equipe (
    id serial primary key,
    match INT REFERENCES match(id),
    equipe INT REFERENCES equipes(id)
);


select*from match_equipe me
    join match m on me.match = m.id
    join coequipier c on c.id_equipe = me.equipe ;

create view duel as 
select c.id_equipe ,
       c.id_joueur,
       me.match 
from match_equipe me
join match m on me.match = m.id
join coequipier c on c.id_equipe = me.equipe ;


create table statistique (
    id serial primary key,
    ppm int,
    npm int,
    pdmp int,
    pmp int,
    eff int,
    fg int,
    point int,
    joueur INT REFERENCES joueurs(id)
);


select*from statistique s 
    join duel d on d.id_joueur = s.joueur ;



create view statistique_joueur as 
select*from statistique s 
    join duel d on d.id_joueur = s.joueur ;


-- Insérer des données de test dans la table "match"
INSERT INTO match (lieu, date) VALUES
('Stade A', '2023-11-15 18:00:00'),
('Stade B', '2023-11-16 19:30:00'),
('Stade C', '2023-11-18 17:45:00');

INSERT into match_equipe VALUES(default,1,1);
INSERT into match_equipe VALUES(default,1,2);

-- Insérer des données de test dans la table "statistique" pour les joueurs de l'ID 6 à l'ID 10
INSERT INTO statistique (ppm, npm, pdmp, pmp, eff, fg, point, joueur) VALUES
(20, 5, 8, 15, 25, 60, 30, 6),
(18, 6, 7, 14, 22, 55, 25, 7),
(22, 4, 9, 16, 28, 65, 32, 8),
(16, 7, 6, 12, 20, 50, 20, 9),
(19, 5, 8, 14, 24, 58, 28, 10);
