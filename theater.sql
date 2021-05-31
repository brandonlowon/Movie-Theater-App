DROP DATABASE IF EXISTS THEATER;
CREATE DATABASE THEATER; 
USE THEATER;


DROP TABLE IF EXISTS MOVIE;
CREATE TABLE MOVIE (
	movieTitle		varchar(25) not null,
	movieRating		varchar(5),
    runTIme			integer,
	primary key (movieTitle)
);

INSERT INTO MOVIE (movieTitle, movieRating, runTime)
VALUES
('Rush', '9/10', 123),
('Dallas Buyers Club', '6/10', 117),
('Finding Nemo', '10/10', 100),
('The Piano', '7/10', 121),
('2001: A Space Odyssey', '8/10', 149),
('The Imitation Game', '8/10', 114),
('In Bruges', '7/10', 107),
('The Last Samurai', '6/10', 154),
('Cinderella Man', '9/10', 144),
('Life of Pi', '8/10', 127);





DROP TABLE IF EXISTS SEAT;
CREATE TABLE SEAT (
	seatNumber		char(4)	not null,
	rowNumber		char(3),
	columnNumber	char(3),

	primary key (seatNumber)
	
);

INSERT INTO Seat (seatNumber, rowNumber, columnNumber)
VALUES
(1,		1,	1),
(2,		1,	2),
(3,		1,	3),
(4,		1,	4),
(5,		2,	1),
(6,		2,	2),
(7,		2,	3),
(8,		2,	4),
(9,		3,	1),
(10,	3,	2),
(11,	3,	3),
(12,	3,	4),
(13,	4,	1),
(14,	4,	2),
(15,	4,	3),
(16,	4,	4);


DROP TABLE IF EXISTS THEATRES ;
CREATE TABLE THEATRES (
	theatreID	     integer(3)	not null,
	theatreName		varchar(25),
	address			varchar(25),
	primary key (theatreID)
);

INSERT INTO THEATRES (theatreID, theatreName, address)
VALUES
(100, 'Theater Calgary', '220 9 Ave SE'),
(101, 'Landmark Cinemas', '16061 Macleod Trail'),
(102, 'Canyon Meadows Cinemas', '300 Country Hills'),
(103, 'Scotiabank Theater', '6455 Macleod Trail'),
(104, 'Cineplex Odeon', '32 Street NE');


DROP TABLE IF EXISTS USER ;
CREATE TABLE USER (
	userID	integer,
	personalEmail	     varchar(50)	not null,
	password	varchar(50),
    name		varchar(50),
    creditCard  bigint,
    address 	varchar(50),
    remainingSubscriptionDays integer,
	primary key (personalEmail)
);

INSERT INTO USER (userID, personalEmail, password, name, creditCard, address, remainingSubscriptionDays)
VALUES
(234534, 'ddallemore0@fotki.com',	'cETntbW7l',	'Dulce Dallemore',	2507174802797420,	'8 Redwing Drive', 122),	
(346345, 'dfader1@prweb.com',	'2DFQxu',	'Damiano Fader',	8024588358245770,	'072 Blackbird Road',123),	
(234785, 'gmaypowder2@google.nl',	'lkPZsS0xYvO',	'Granger Maypowder',	24813142794508,	'62069 Springs Point',327),	
(348594, 'smcdunlevy3@facebook.com',	'p5ZSi2',	'Skye McDunlevy',	3498440235487420,	'7842 Tomscot Point',178),	
(432578, 'adarleston4@mlb.com',	'yttjtQZpf',	'Allina Darleston',	7285665862507170,	'46352 Hanover Center',23),	
(345985, 'mtopley5@friendfeed.com',	'meX5NRlISUS',	'Mehetabel Topley',	1082555012471700,	'4 Erie Trail',56),	
(234564, 'fbleythin6@narod.ru',	'vvSPfCgMi',	'Flori Bleythin',	3604893989523910,	'97228 Kropf Place',22),	
(708908, 'hgabbat7@craigslist.org',	'fkcq9sr',	'Hestia Gabbat',	4612990151200860,	'5 Huxley Terrace',286),	
(132414, 'schrishop8@godaddy.com',	'G35xurAveQ1N',	'Sammie Chrishop',	4442584317119660,	'2 Dayton Avenue',343),	
(005633, 'mbattson9@parallels.com',	'gdITrxqG',	'Marice Battson',	1702794063644240,	'3087 Nelson Drive',132),	
(542322,'ashentona@archive.org',	'ba8MwXhy7Q',	'Annice Shenton',	5990809129235770,	'915 Maple Terrace',22),	
(489854, 'sfaraharb@wufoo.com',	'61CymTS5VpT',	'Sarita Farahar',	5656270302455230,	'92200 Sutteridge Street',75),	
(121342, 'bsrawleyc@ow.ly',	'ouJsrg9lmV4',	'Ban Srawley',	114814231486741,	'72 Lotheville Avenue',45),	
(567872,'nkirmand@booking.com',	'AlV14e',	'Nicholas Kirman',	63627510743609,	'101 Crescent Oaks Point',139),	
(678098, 'mwhinneye@eventbrite.com',	'BX9dNVn4rWX',	'Moishe Whinney',	9978199269473130,	'331 Elmside Point',355),	
(123123, 'lgellettf@wikipedia.org',	'ivkF0x',	'Lora Gellett',	221141439357685,	'2 Helena Circle',254),	
(987797, 'dmawneg@printfriendly.com',	'efTKIOC5Y',	'Devinne Mawne',	4919474964359990,	'929 Brentwood Lane',176),	
(123533,'hsollarsh@wordpress.org',	'TRcCdLhi',	'Homerus Sollars',	1733008217023560,	'4 Kennedy Parkway',146),	
(786544,'granaldi@npr.org',	'rkQ6aVxBgcN',	'Georgy Ranald',	2490153655844160,	'91 Shelley Hill',198),	
(456780, 'rblasonij@foxnews.com',	'041b7EF',	'Roxi Blasoni',	9967252056678640,	'34557 Corry Hill',173),	
(123412, 'aputtank@intel.com',	'30BgMGuC',	'Amii Puttan',	6520679438643010,	'3597 Donald Trail',141),	
(340958, 'dabbyl@addthis.com',	'QwaEarFhuZ',	'Davin Abby',	3654173784239510,	'8131 Thackeray Parkway',29),	
(123453,'hmolem@soundcloud.com',	'PjjZUOX',	'Hatty Mole',	2275660503963750,	'410 Dryden Pass',241),	
(456012,'esiebertn@ezinearticles.com',	'xPKPwnuJf72d',	'Elladine Siebert',	3809093077559130,	'91400 Oriole Place',199),	
(145323,'cdosdillo@oracle.com',	'AbvwtO5Safq',	'Celestine Dosdill',	2169323603846410,	'1251 Maple Wood Avenue', 98),	
(878678,'kyieldingp@businesswire.com',	'KVI8C5fSJBB',	'Kellsie Yielding',	7234720710443660,	'547 Del Sol Way', 58),	
(234522,'jshillingfordq@sfgate.com',	'GLVbJZkwAhqE',	'Johnathan Shillingford',	1265768240262840,	'2 Merchant Court',41),	
(123478,'oocalleranr@cdbaby.com',	'CVRnup1ams9',	'Osbourn OCalleran',	4956928089910150,	'1 Thackeray Center',321),	
(324562,'jrudes@marriott.com',	'fQGN0fEl',	'Joya Rude',	8024798234111420,	'3855 Hoffman Point',311),	
(764432,'monraett@pen.io',	'vV7ipqES',	'Moshe Onraet',	1703664516707080,	'5802 Maple Wood Place',42);	
