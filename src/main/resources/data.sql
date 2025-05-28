INSERT INTO GYM_STAFF(name,phone_Num,address) VALUES('John Doe', '3749201836', '123 Main St'),
                                                       ('Jane Smith', '4928103746', '456 Elm St'),
                                                       ('Bob Johnson', '1029384756', '789 Oak St'),
                                                       ('Alice Williams', '6574839201', '321 Pine St'),
                                                       ('Charlie Brown', '1827364950', '654 Maple St'),
                                                       ('Dave Wilson', '8473920657', '987 Cedar St'),
                                                       ('Eve Black', '3847562910', '246 Birch St'),
                                                       ('Frank White', '1029384756', '369 Spruce St'),
                                                       ('Grace Green', '3847562910', '159 Willow St'),
                                                       ('Henry Blue', '8473920657', '753 Aspen St');

INSERT INTO Memberships(membership_name,
 training_time,
 price,
 price_per_month,
 price_per_day,
 number_of_session,
 training_card_type,
 including_trainer,
 training_class,
 description)
VALUES ('Membership 1', '12', 500.00, 100, 10, 20, 'Short-term', true, 'FITNESS-10', 'Membership 1 description'),
       ('Membership 2', '24', 600.00, 120, 12, 30, 'Long-term', false, 'FITNESS-2', 'Membership 2 description'),
       ('Membership 3', '36', 700.00, 150, 15, 40, 'Diamond', true, 'YOGA-6', 'Membership 3 description'),
       ('Membership 4', '48', 800.00, 180, 18, 50, 'Short-term', false, 'YOGA-9', 'Membership 4 description'),
       ('Membership 5', 'One day', 100.00, 0, 20, 10, 'Short-term', true, 'FITNESS-7', 'Membership 5 description');

INSERT INTO Members(name, age, gender, email, phone_number, occupation, birthday, job, member_type)
VALUES ('John Doe', 30, 'Male', 'johndoe@example.com', '1234567890', 'Engineer', '1990-01-01', 'Software Developer', 'Classic'),
       ('Jane Smith', 25, 'Female', 'janesmith@example.com', '9876543210', 'Designer', '1995-02-15', 'Graphic Designer', 'Diamond'),
       ('Bob Johnson', 35, 'Male', 'bobjohnson@example.com', '5555555555', 'Teacher', '1986-06-10', 'English Teacher', 'Classic'),
       ('Alice Williams', 28, 'Female', 'alicewilliams@example.com', '2222222222', 'Doctor', '1993-09-20', 'Surgeon', 'Diamond'),
       ('Charlie Brown', 32, 'Male', 'charliebrown@example.com', '3333333333', 'Lawyer', '1989-04-05', 'Attorney', 'Classic'),
       ('Dave Wilson', 27, 'Male', 'davewilson@example.com', '4444444444', 'Accountant', '1994-11-15', 'CPA', 'Classic'),
       ('Eve Black', 29, 'Female', 'eveblack@example.com', '6666666666', 'Artist', '1992-07-25', 'Painter', 'Diamond'),
       ('Frank White', 31, 'Male', 'frankwhite@example.com', '7777777777', 'Engineer', '1991-12-05', 'Mechanical Engineer', 'Classic');



INSERT INTO facility (facility_Name, type, date_Of_Purchase, warranty_Date, origin,status,quantity)
VALUES
  ('Bowflex SelectTech 552 Dumbbell', 'Dumbbell', '2022-06-01', '2023-06-01', 'USA','new',100),
  ('PowerBlock Elite Dumbbell', 'Dumbbell', '2022-06-01', '2023-06-01', 'USA','new',100),
  ('CAP Barbell Coated Hex Dumbbell', 'Dumbbell', '2022-06-01', '2023-06-01', 'USA','new',100),
  ('Amazon Basics Rubber Encased Hex Dumbbell', 'Dumbbell', '2022-06-01', '2023-06-01', 'USA','new',100),
  ('SPRI Deluxe Rubber Dumbbell', 'Dumbbell', '2022-06-01', '2023-06-01', 'USA','new',100),
  ('Rogue Fitness Ohio Barbell', 'Barbell', '2022-06-02', '2023-06-02', 'USA','new',100),
  ('Eleiko Olympic Weightlifting Barbell', 'Barbell', '2022-06-02', '2023-06-02', 'Sweden','new',100),
  ('CAP Barbell Olympic Barbell', 'Barbell', '2022-06-02', '2023-06-02', 'USA','new',100),
  ('Manduka Pro Yoga Mat', 'Yoga mat', '2022-06-01', '2023-06-01', 'USA','new',100),
    ('Liforme Yoga Mat', 'Yoga mat', '2022-06-01', '2023-06-01', 'UK','new',100),
    ('Jade Harmony Professional Yoga Mat', 'Yoga mat', '2022-06-01', '2023-06-01', 'USA','new',100),
    ('Gaiam Essentials Thick Yoga Mat', 'Yoga mat', '2022-06-01', '2023-06-01', 'USA','new',100),
    ('Alo Yoga Warrior Mat', 'Yoga mat', '2022-06-01', '2023-06-01', 'USA','new',100),
    ('NordicTrack Commercial 1750 Treadmill', 'Treadmill', '2022-06-01', '2023-06-01', 'USA','new',100),
      ('ProForm SMART Pro 5000 Treadmill', 'Treadmill', '2022-06-01', '2023-06-01', 'USA','new',100),
      ('Sole F85 Folding Treadmill', 'Treadmill', '2022-06-01', '2023-06-01', 'USA','new',100),
      ('Horizon Fitness T101 Treadmill', 'Treadmill', '2022-06-01', '2023-06-01', 'USA','new',100),
      ('LifeSpan TR1200i Folding Treadmill', 'Treadmill', '2022-06-01', '2023-06-01', 'USA','new',100),
      ('Concept2 Model D Indoor Rowing Machine', 'Rowing machine', '2022-06-01', '2023-06-01', 'USA','new',100),
        ('Body-Solid Powerline Cable Crossover Machine', 'Cable', '2022-06-01', '2023-06-01', 'USA','new',100),
        ('Everlast Pro Style Boxing Gloves', 'Boxing gloves', '2022-06-01', '2023-06-01', 'USA','new',100),
        ('Fit Simplify Resistance Loop Exercise Bands with Instruction Guide and Carry Bag', 'Resistance bands', '2022-06-01', '2023-06-01', 'USA','new',100),
        ('Marcy Smith Cage Workout Machine Total Body Training Home Gym System with Linear Bearing MD-9010G', 'Gym machine', '2022-06-01', '2023-06-01', 'USA','new',100),
        ('Bowflex SelectTech 552 Dumbbell', 'Dumbbell', '2022-06-01', '2023-06-01', 'USA','new',100),
          ('PowerBlock Elite Dumbbell', 'Dumbbell', '2022-06-01', '2023-06-01', 'USA','new',100),
          ('CAP Barbell Coated Hex Dumbbell', 'Dumbbell', '2022-06-01', '2023-06-01', 'USA','new',100),
          ('Amazon Basics Rubber Encased Hex Dumbbell', 'Dumbbell', '2022-06-01', '2023-06-01', 'USA','new',100),
          ('SPRI Deluxe Rubber Dumbbell', 'Dumbbell', '2022-06-01', '2023-06-01', 'USA','new',100),
          ('Rogue Fitness Ohio Barbell', 'Barbell', '2022-06-02', '2023-06-02', 'USA','new',100),
          ('Eleiko Olympic Weightlifting Barbell', 'Barbell', '2022-06-02', '2023-06-02', 'Sweden','new',100),
          ('CAP Barbell Olympic Barbell', 'Barbell', '2022-06-02', '2023-06-02', 'USA','new',100),
          ('Rogue Fitness Bella Bar 2.0 Women’s Barbell','Barbell','2022-6-2','2023-6-2','USA','new',100),
          ('Titan Fitness Atlas Bar Women’s Barbell','Barbell','2022-6-2','2023-6-2','USA','new',100),
          ('Rogue Fitness Calibrated Steel Powerlifting Plates','Weight Plate','2022-6-3','2023-6-3','USA','new',100),
          ('Eleiko IWF Weightlifting Competition Plates','Weight Plate','2022-6-3','2023-6-3','Sweden','new',100),
          ('Rogue Fitness Fleck Bumper Plates','Weight Plate','2022-6-3','2023-6-3','USA','new',100),
          ('CAP Barbell Cast Iron Kettlebell','Kettlebell','2022-6-4','2023-6-4','USA','new',100),
          ('Kettle Gryp Portable Kettlebell Adapter for Dumbbells','Kettlebell','2022-6-4','2023-6-4','USA','new',100)
;

INSERT INTO Trainer (address, citizen_identityid, dob, finish_contract_date, name, phone_num, start_date, trainer_type) VALUES
('123 ABC Street, XYZ City', '123456789', '1990-01-01', '2023-12-31', 'John Doe', '987654321', '2021-01-01', 'PT gym'),
('456 DEF Street, XYZ City', '987654321', '1992-03-15', '2023-12-31', 'Jane Smith', '123456789', '2021-01-01', 'PT gym'),
('789 GHI Street, XYZ City', '456789123', '1985-07-20', '2023-12-31', 'Michael Johnson', '543216789', '2021-01-01', 'Giáo viên yoga'),
('321 JKL Street, XYZ City', '789123456', '1993-12-05', '2023-12-31', 'Emily Davis', '987654321', '2021-01-01', 'PT gym'),
('654 MNO Street, XYZ City', '321654987', '1988-09-10', '2023-12-31', 'Samantha Wilson', '123456789', '2021-01-01', 'Giáo viên Arobic'),
('987 PQR Street, XYZ City', '654987321', '1991-06-25', '2023-12-31', 'David Thompson', '543216789', '2021-01-01', 'Giáo viên Arobic'),
('321 STU Street, XYZ City', '987321654', '1987-04-12', '2023-12-31', 'Amanda Lee', '987654321', '2021-01-01', 'PT gym'),
('456 VWX Street, XYZ City', '654321987', '1994-08-03', '2023-12-31', 'Daniel Anderson', '123456789', '2021-01-01', 'Giáo viên Arobic'),
('789 YZA Street, XYZ City', '321987654', '1986-11-18', '2023-12-31', 'Sophia Moore', '543216789', '2021-01-01', 'Giáo viên yoga'),
('987 BCD Street, XYZ City', '987654321', '1995-02-28', '2023-12-31', 'William Clark', '987654321', '2021-01-01', 'PT gym');


INSERT INTO Registration (member_id, membership_id, registration_date, registration_type, trainer_id)
VALUES
  (1, 1, '2023-06-01 09:00:00', 'monthly', 2),
  (2, 2, '2023-06-05 14:30:00', 'hourly', 1),
  (3, 1, '2023-06-15 18:45:00', 'monthly', 5),
  (4, 2, '2023-06-02 11:15:00', 'hourly', 7),
  (5, 1, '2023-06-10 16:30:00', 'monthly', 4),
  (1, 2, '2023-06-12 13:45:00', 'hourly', 8),
  (2, 1, '2023-06-18 17:30:00', 'monthly', 3),
  (3, 2, '2023-06-07 10:00:00', 'hourly', 2),
  (4, 1, '2023-06-20 15:15:00', 'monthly', 1),
  (5, 2, '2023-06-25 19:45:00', 'hourly', 9);

INSERT INTO Users(username ,password,role)
 VALUES
     ('admin','123456','admin'),
     ('staff','123456','staff'),
     ('trainer','123456','trainer'),
     ('member','123456','member');

INSERT INTO Feedback (feedback_content, feedback_type, member_id)
VALUES
  ('Great session!', 0, 1),
  ('The trainer was very knowledgeable.', 0, 2),
  ('I enjoyed the workout.', 1, 3),
  ('Need more variety in exercises.', 1, 4),
  ('The staff was helpful.', 1, 2),
  ('The trainer pushed me to my limits.', 0, 3),
  ('I didn''t like the equipment.', 1, 1),
  ('The trainer was late.', 0, 4),
  ('I had a great experience overall.', 1, 5),
  ('I didn''t receive any assistance.', 1, 3);

INSERT INTO Yoga_Class (id, name, maximum_number, location, is_Occupied)
VALUES ('YOGA-1', 'Yoga Class 1', 15, 'D-150', true);

INSERT INTO Yoga_Class (id, name, maximum_number, location, is_Occupied)
VALUES ('FITNESS-2', 'Fitness Class 2', 18, 'D-180', true);

INSERT INTO Yoga_Class (id, name, maximum_number, location, is_Occupied)
VALUES ('FITNESS-3', 'Fitness Class 3', 20, 'D-200', true);

INSERT INTO Yoga_Class (id, name, maximum_number, location, is_Occupied)
VALUES ('YOGA-4', 'Yoga Class 4', 22, 'D-220', true);

INSERT INTO Yoga_Class (id, name, maximum_number, location, is_Occupied)
VALUES ('FITNESS-5', 'Fitness Class 5', 25, 'D-250', true);

INSERT INTO Yoga_Class (id, name, maximum_number, location, is_Occupied)
VALUES ('YOGA-6', 'Yoga Class 6', 28, 'D-280', true);

INSERT INTO Yoga_Class (id, name, maximum_number, location, is_Occupied)
VALUES ('FITNESS-7', 'Fitness Class 7', 30, 'D-300', true);

INSERT INTO Yoga_Class (id, name, maximum_number, location, is_Occupied)
VALUES ('FITNESS-8', 'Fitness Class 8',32 , 'D-320' ,true);

INSERT INTO Yoga_Class (id,name ,maximum_number ,location,is_Occupied)
VALUES ('YOGA-9','Yoga Class 9' ,10 ,'D-100' ,true);

INSERT INTO Yoga_Class (id,name ,maximum_number ,location,is_Occupied)
VALUES ('FITNESS-10','Fitness Class 10' ,12 ,'D-120' ,true);

INSERT INTO Gym_has_facility (gym_id, facility_id, quantity)
VALUES ('FITNESS-10', 1, 10),
       ('FITNESS-2', 2, 20),
       ('FITNESS-3', 3, 30),
       ('FITNESS-5', 4, 40),
       ('FITNESS-7', 5, 50),
       ('FITNESS-8', 6, 60),
       ('YOGA-1', 7, 70),
       ('YOGA-4', 8, 80),
       ('YOGA-6', 9, 90),
       ('YOGA-9', 10, 100),
       ('FITNESS-10', 11, 10),
       ('FITNESS-2', 12, 20),
       ('FITNESS-3', 13, 30),
       ('FITNESS-5', 14, 40),
       ('FITNESS-7', 15, 50),
       ('FITNESS-8', 16, 60),
       ('YOGA-1', 17, 70),
       ('YOGA-4', 18, 80),
       ('YOGA-6', 19,90 ),
       ('YOGA-9',20 ,100);
INSERT INTO Training_History(Member_id, training_day, training_time, trainer_id)
VALUES
    (1, '2022-01-01', '10:00', 1),
    (1, '2022-01-02', '14:00', 3),
    (2, '2022-01-03', '09:30', 2),
    (2, '2022-01-04', '16:00', 4),
    (3, '2022-01-05', '11:00', 3),
    (3, '2022-01-06', '15:30', 5),
    (4, '2022-01-07', '08:00', 4),
    (4, '2022-01-08', '17:00', 7),
    (5, '2022-01-09', '13:30', 5),
    (5, '2022-01-10', '10:30', 7);
INSERT INTO Class_Manager(manager_id, gym_class_id) VALUES
(3,'YOGA-1'),
(4,'FITNESS-2'),
(5,'FITNESS-3'),
(6,'YOGA-4'),
(7,'FITNESS-5'),
(8,'YOGA-6'),
(9,'FITNESS-7'),
(10,'FITNESS-8'),
(1,'YOGA-9'),
(2,'FITNESS-10');