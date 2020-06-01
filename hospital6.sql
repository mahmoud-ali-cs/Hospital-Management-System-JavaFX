-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 22, 2019 at 01:06 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital6`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `username` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  `type` varchar(40) NOT NULL,
  `owner` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`username`, `password`, `type`, `owner`) VALUES
('ali', '1236862', 'receptionist', 2),
('fawzy', '12345ff6', 'manager', 1),
('mahmoud', '123456', 'manager', 0),
('marwan', '123456', 'receptionist', 0),
('omar', '1234ff56', 'receptionist', 2),
('osama', '12368ff62', 'receptionist', 3);

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `myKey` int(11) NOT NULL,
  `departmentName` varchar(40) DEFAULT NULL,
  `doctorsKey` varchar(40) DEFAULT NULL,
  `numOfDoctors` int(11) DEFAULT NULL,
  `patientsKey` varchar(40) DEFAULT NULL,
  `numOfPatients` int(11) DEFAULT NULL,
  `nursesKey` varchar(15) DEFAULT NULL,
  `numOfNurses` int(15) DEFAULT NULL,
  `roomsKey` varchar(40) DEFAULT NULL,
  `numOfRooms` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`myKey`, `departmentName`, `doctorsKey`, `numOfDoctors`, `patientsKey`, `numOfPatients`, `nursesKey`, `numOfNurses`, `roomsKey`, `numOfRooms`) VALUES
(0, 'Department One', '', 0, '', 0, '', 0, '', 0),
(1, 'Department Two', '', 0, '', 0, '', 0, '', 0),
(2, 'Department Three', '', 0, '', 0, '', 0, '', 0),
(3, 'Department Four', '', 0, '', 0, '', 0, '', 0);

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `myKey` int(40) NOT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(225) DEFAULT NULL,
  `id` varchar(40) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `dateOfBirth` varchar(20) NOT NULL,
  `age` int(4) DEFAULT NULL,
  `address` varchar(255) NOT NULL,
  `phoneNumber` varchar(200) NOT NULL,
  `email` varchar(255) NOT NULL,
  `salary` double NOT NULL,
  `myDepartment` int(11) DEFAULT NULL,
  `myPatients` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`myKey`, `firstName`, `lastName`, `id`, `gender`, `dateOfBirth`, `age`, `address`, `phoneNumber`, `email`, `salary`, `myDepartment`, `myPatients`) VALUES
(5, 'mahmoud', 'mohamed', '546984656', 'male', '11/11/2018', 20, 'fdagag', '54621654', 'fasfasgasg', 2000, 0, ''),
(6, 'Marwan', 'mohamed', '546984656', 'male', '11/11/2018', 20, 'fdagag', '54621654', 'fasfasgasg', 2000, 0, ''),
(7, 'Fawzy', 'mohamed', '546984656', 'male', '11/11/2018', 20, 'fdagag', '54621654', 'fasfasgasg', 2000, 0, ''),
(8, 'ali', 'mohamed', '546984656', 'male', '11/11/2018', 20, 'fdagag', '54621654', 'fasfasgasg', 2000, 0, ''),
(9, 'osama', 'mohamed', '546984656', 'male', '11/11/2018', 20, 'fdagag', '54621654', 'fasfasgasg', 2000, 0, ''),
(10, 'sara', 'mohamed', '546984656', 'female', '11/11/2018', 20, 'fdagag', '54621654', 'fasfasgasg', 2000, 0, ''),
(11, 'mirna', 'mohamed', '546984656', 'female', '11/11/2018', 20, 'fdagag', '54621654', 'fasfasgasg', 2000, 0, ''),
(12, 'omar', 'mohamed', '546984656', 'male', '11/11/2018', 20, 'fdagag', '54621654', 'fasfasgasg', 2000, 0, ''),
(13, 'ali', 'omar', '546984656', 'male', '11/11/2018', 20, 'fdagag', '54621654', 'fasfasgasg', 2000, 0, '');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `myKey` int(11) NOT NULL,
  `firstName` varchar(100) DEFAULT NULL,
  `lastName` varchar(100) DEFAULT NULL,
  `id` varchar(20) DEFAULT NULL,
  `gender` varchar(40) NOT NULL,
  `dateOfBirth` varchar(40) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `phoneNumber` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `salary` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `manager`
--

CREATE TABLE `manager` (
  `myKey` int(11) NOT NULL,
  `firstName` varchar(40) NOT NULL,
  `lastName` varchar(40) NOT NULL,
  `id` varchar(40) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `dateOfBirth` varchar(40) NOT NULL,
  `age` int(11) NOT NULL,
  `address` varchar(40) NOT NULL,
  `phoneNumber` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `salary` double NOT NULL,
  `managerAccount` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `manager`
--

INSERT INTO `manager` (`myKey`, `firstName`, `lastName`, `id`, `gender`, `dateOfBirth`, `age`, `address`, `phoneNumber`, `email`, `salary`, `managerAccount`) VALUES
(28, 'mahmoud', 'mohamed', '54464654', 'male', '22/22/25', 20, 'fadsgsa', '5264513', 'dgftrtr', 20000, 'mahmoud'),
(29, 'fawzy', 'mohamed', '54464654', 'male', '22/22/25', 20, 'fadsgsa', '5264513', 'dgftrtr', 20000, 'fawzy');

-- --------------------------------------------------------

--
-- Table structure for table `nurse`
--

CREATE TABLE `nurse` (
  `myKey` int(11) NOT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(225) DEFAULT NULL,
  `id` varchar(40) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `dateOfBirth` varchar(20) NOT NULL,
  `age` int(4) DEFAULT NULL,
  `address` varchar(255) NOT NULL,
  `phoneNumber` varchar(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `salary` double NOT NULL,
  `myRoom` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nurse`
--

INSERT INTO `nurse` (`myKey`, `firstName`, `lastName`, `id`, `gender`, `dateOfBirth`, `age`, `address`, `phoneNumber`, `email`, `salary`, `myRoom`) VALUES
(30, 'mahmoud', 'mohamed', '564531354', 'male', '22/66/11', 33, 'gsfdgdfg', '964621', 'fafadfaf', 6000, 0),
(31, 'marwan', 'mohamed', '564531354', 'male', '22/66/11', 33, 'gsfdgdfg', '964621', 'fafadfaf', 6000, 0),
(32, 'ali', 'mohamed', '564531354', 'male', '22/66/11', 33, 'gsfdgdfg', '964621', 'fafadfaf', 6000, 0),
(33, 'fawzy', 'mohamed', '564531354', 'male', '22/66/11', 33, 'gsfdgdfg', '964621', 'fafadfaf', 6000, 0),
(34, 'moamen', 'mohamed', '564531354', 'male', '22/66/11', 33, 'gsfdgdfg', '964621', 'fafadfaf', 6000, 0),
(35, 'omar', 'mohamed', '564531354', 'male', '22/66/11', 33, 'gsfdgdfg', '964621', 'fafadfaf', 6000, 0);

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `myKey` int(11) NOT NULL,
  `firstName` varchar(20) NOT NULL,
  `lastName` varchar(20) NOT NULL,
  `id` varchar(30) NOT NULL,
  `gender` varchar(40) NOT NULL,
  `dateOfBirth` varchar(50) NOT NULL,
  `age` int(11) NOT NULL,
  `address` varchar(100) NOT NULL,
  `phoneNumber` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `medicalHistory` varchar(100) NOT NULL,
  `fees` double NOT NULL,
  `myDoctor` int(11) NOT NULL,
  `myDepartment` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`myKey`, `firstName`, `lastName`, `id`, `gender`, `dateOfBirth`, `age`, `address`, `phoneNumber`, `email`, `medicalHistory`, `fees`, `myDoctor`, `myDepartment`) VALUES
(29, 'mahmoud', 'mohamed', '1111111', 'male', '56465/56465/5', 1, 'dddddd', '444444', 'aaaaaaaa', '', 0, 0, 2),
(30, 'ali', 'mahmoud', '34234254', 'female', '44-=44', 2, 'fafdfa', '555555', 'jjjjj', '', 0, 0, 2),
(31, 'marwan', 'mohamed', '1111111', 'male', '1/1/2', 22, 'aaaaa', '5555555', 'fffff', '', 0, 1, 1),
(32, 'mahmoud', 'fawzy', '6666', 'male', '33/33', 222, 'fadfaf', '66666', 'fafafaaaaaa', '', 0, 3, 2),
(33, 'mahmoud', 'aliali', '55555', 'male', '55/55/55', 55, 'aaaaa', '5555555', 'aaaaaa', '4444444', 0, 4, 2),
(39, '', '', '', 'male', '', 11, '', '', '', '', 0, 3, 2),
(41, 'mahmoud', 'aliali', '55555', 'male', '55/55/55', 55, 'aaaaa', '5555555', 'aaaaaa', '', 0, 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `receptionist`
--

CREATE TABLE `receptionist` (
  `myKey` int(11) NOT NULL,
  `firstName` varchar(100) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `id` varchar(20) NOT NULL,
  `gender` varchar(40) NOT NULL,
  `dateOfBirth` varchar(40) NOT NULL,
  `age` int(11) NOT NULL,
  `address` varchar(200) NOT NULL,
  `phoneNumber` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `salary` int(11) NOT NULL,
  `receptionistAccount` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `receptionist`
--

INSERT INTO `receptionist` (`myKey`, `firstName`, `lastName`, `id`, `gender`, `dateOfBirth`, `age`, `address`, `phoneNumber`, `email`, `salary`, `receptionistAccount`) VALUES
(28, 'mahmoud', 'mohamed', '56435135', 'male', '22/22/200', 20, 'aaaaaa', '555555', 'tgreysy', 6000, 'mohamed'),
(29, 'ali', 'mohamed', '56435135', 'male', '22/22/200', 20, 'aaaaaa', '555555', 'tgreysy', 6000, 'ali'),
(30, 'fawzy', 'mohamed', '56435135', 'male', '22/22/200', 20, 'aaaaaa', '555555', 'tgreysy', 6000, 'fawzy'),
(31, 'mahmoud', 'mohamed', '56435135', 'male', '22/22/200', 20, 'aaaaaa', '555555', 'tgreysy', 6000, 'mohamed2'),
(32, 'ali', 'mohamed', '56435135', 'male', '22/22/200', 20, 'aaaaaa', '555555', 'tgreysy', 6000, 'ali2'),
(33, 'fawzy', 'mohamed', '56435135', 'male', '22/22/200', 20, 'aaaaaa', '555555', 'tgreysy', 6000, 'fawzy2');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `myKey` int(11) NOT NULL,
  `numOfBeds` int(11) NOT NULL,
  `numOfPatients` int(11) NOT NULL,
  `type` varchar(40) NOT NULL,
  `myDepartment` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`myKey`, `numOfBeds`, `numOfPatients`, `type`, `myDepartment`) VALUES
(28, 3, 0, 'A', 0),
(29, 5, 0, 'A', 0),
(30, 3, 0, 'A', 1),
(31, 5, 0, 'A', 1),
(32, 3, 0, 'A', 2),
(33, 5, 0, 'A', 2),
(34, 3, 0, 'B', 0),
(35, 5, 0, 'B', 0),
(36, 3, 0, 'B', 1),
(37, 5, 0, 'B', 1),
(38, 3, 0, 'B', 2),
(39, 5, 0, 'B', 2),
(40, 3, 0, 'C', 0),
(41, 5, 0, 'C', 0),
(42, 3, 0, 'C', 1),
(43, 5, 0, 'C', 1),
(44, 3, 0, 'C', 2),
(45, 5, 0, 'C', 2),
(46, 1, 0, 'Surgery', 0),
(47, 1, 0, 'Surgery', 1),
(48, 1, 0, 'Surgery', 2),
(49, 1, 0, 'Surgery', 0),
(50, 1, 0, 'Surgery', 1),
(51, 1, 0, 'Surgery', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`myKey`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`myKey`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`myKey`);

--
-- Indexes for table `manager`
--
ALTER TABLE `manager`
  ADD PRIMARY KEY (`myKey`);

--
-- Indexes for table `nurse`
--
ALTER TABLE `nurse`
  ADD PRIMARY KEY (`myKey`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`myKey`);

--
-- Indexes for table `receptionist`
--
ALTER TABLE `receptionist`
  ADD PRIMARY KEY (`myKey`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`myKey`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `department`
--
ALTER TABLE `department`
  MODIFY `myKey` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `myKey` int(40) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `myKey` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `manager`
--
ALTER TABLE `manager`
  MODIFY `myKey` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT for table `nurse`
--
ALTER TABLE `nurse`
  MODIFY `myKey` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `myKey` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT for table `receptionist`
--
ALTER TABLE `receptionist`
  MODIFY `myKey` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT for table `room`
--
ALTER TABLE `room`
  MODIFY `myKey` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
