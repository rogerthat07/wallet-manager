-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 09, 2018 at 04:49 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `password_manager`
--
CREATE DATABASE IF NOT EXISTS `password_manager` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `password_manager`;

-- --------------------------------------------------------

--
-- Table structure for table `addedpasscat`
--

CREATE TABLE `addedpasscat` (
  `category` varchar(100) NOT NULL,
  `id` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `addedpasscat`
--

INSERT INTO `addedpasscat` (`category`, `id`) VALUES
('Locker', 1);

-- --------------------------------------------------------

--
-- Table structure for table `bankcards`
--

CREATE TABLE `bankcards` (
  `sno` int(100) NOT NULL,
  `id` int(100) NOT NULL,
  `accountholdername` varchar(200) NOT NULL,
  `routingnumber` varchar(200) NOT NULL,
  `accountnumber` int(16) NOT NULL,
  `bankname` varchar(200) NOT NULL,
  `note` varchar(200) DEFAULT NULL,
  `passwordprotected` varchar(100) NOT NULL DEFAULT 'true',
  `cardname` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `bankcards`
--

INSERT INTO `bankcards` (`sno`, `id`, `accountholdername`, `routingnumber`, `accountnumber`, `bankname`, `note`, `passwordprotected`, `cardname`) VALUES
(3, 2, '3213', '131', 131, '231', NULL, 'true', 'cardname3');

-- --------------------------------------------------------

--
-- Table structure for table `category_table`
--

CREATE TABLE `category_table` (
  `category` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `category_table`
--

INSERT INTO `category_table` (`category`) VALUES
('Bussiness'),
('Career'),
('Entertainment'),
('Finance'),
('Health'),
('News'),
('Other'),
('Real Estate'),
('Shopping'),
('Social Media'),
('Tech'),
('Travel');

-- --------------------------------------------------------

--
-- Table structure for table `creditcards`
--

CREATE TABLE `creditcards` (
  `sno` int(100) NOT NULL,
  `id` int(100) NOT NULL,
  `cardholdername` varchar(200) NOT NULL,
  `cardname` varchar(100) NOT NULL,
  `cardnumber` varchar(200) NOT NULL,
  `securitycode` varchar(200) NOT NULL,
  `expirydate` varchar(100) NOT NULL,
  `issuingbank` varchar(200) NOT NULL,
  `cardcolor` varchar(100) NOT NULL,
  `note` varchar(300) DEFAULT NULL,
  `passwordprotected` varchar(100) NOT NULL DEFAULT 'true'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `creditcards`
--

INSERT INTO `creditcards` (`sno`, `id`, `cardholdername`, `cardname`, `cardnumber`, `securitycode`, `expirydate`, `issuingbank`, `cardcolor`, `note`, `passwordprotected`) VALUES
(6, 2, '123131', 'cardname6', '1333333333333333', '31313131313131313131313131313131311331', '5-2024', '21332321', 'Blue', NULL, 'true'),
(7, 2, 'root', 'cardname7', '1321321312321313', '1234', '10-2035', 'PNB', 'Black', '', 'true');

-- --------------------------------------------------------

--
-- Table structure for table `details`
--

CREATE TABLE `details` (
  `sno` int(100) NOT NULL,
  `id` int(100) NOT NULL,
  `email` varchar(200) DEFAULT NULL,
  `login` varchar(200) NOT NULL,
  `secondarylogin` varchar(200) DEFAULT NULL,
  `password` varchar(200) NOT NULL,
  `website` varchar(200) NOT NULL,
  `name` varchar(200) NOT NULL,
  `category` varchar(100) NOT NULL,
  `note` varchar(200) DEFAULT NULL,
  `passwordprotected` varchar(100) NOT NULL DEFAULT 'true'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `details`
--

INSERT INTO `details` (`sno`, `id`, `email`, `login`, `secondarylogin`, `password`, `website`, `name`, `category`, `note`, `passwordprotected`) VALUES
(19, 2, '', '123', '', '123', 'https://123', 'https://123', '1', '', 'true'),
(20, 2, '', '1231', '', '1231', 'https://123', 'https://123', '2', '', 'true'),
(21, 2, '', '123', '', '123', 'https://123', 'https://123', '7', '', 'false'),
(22, 2, '', 'eliote', '', 'eliote123', 'https://fb.com', 'https://fb.com', '7', '', 'true'),
(23, 2, '', '1', '', '2240376247386613129', 'https://google.com', 'https://google.com', '8', '', 'true'),
(24, 2, '', '1', '', '1', 'https://1', 'https://1', '1', '', 'true');

-- --------------------------------------------------------

--
-- Table structure for table `idcards`
--

CREATE TABLE `idcards` (
  `sno` int(100) NOT NULL,
  `id` int(100) NOT NULL,
  `cardname` varchar(200) NOT NULL,
  `cardnumber` int(200) NOT NULL,
  `gender` varchar(100) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `issuedate` date DEFAULT NULL,
  `expirydate` date DEFAULT NULL,
  `passwordprotected` varchar(100) NOT NULL DEFAULT 'true',
  `note` varchar(300) DEFAULT NULL,
  `cardtype` varchar(100) NOT NULL,
  `placeofissue` varchar(200) DEFAULT NULL,
  `state` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `idcards`
--

INSERT INTO `idcards` (`sno`, `id`, `cardname`, `cardnumber`, `gender`, `dob`, `issuedate`, `expirydate`, `passwordprotected`, `note`, `cardtype`, `placeofissue`, `state`) VALUES
(2, 2, 'cardname2', 123, 'Male', '2018-06-06', '2024-06-07', '2036-07-08', 'false', '', 'Passport', 'jalandhar', NULL),
(3, 2, 'cardname3', 123, 'Male', '2018-06-06', '1972-02-03', '1976-03-03', 'true', '', 'ID Card', NULL, NULL),
(4, 2, 'cardname4', 131231, 'Male', '1974-04-05', '1987-06-15', '2017-07-27', 'false', '', 'Driver\'s License', NULL, 'india'),
(5, 2, 'cardname5', 2131, NULL, '1976-06-07', '2003-07-28', '2047-07-31', 'false', '34234', 'Tax Numbers', NULL, NULL),
(6, 2, 'cardname6', 1111, 'Male', '2023-03-04', '2048-06-06', '2049-07-19', 'true', NULL, 'ID Card', NULL, NULL),
(7, 2, 'cardname7', 1111111111, 'Male', '1974-03-05', '2000-04-05', '2045-04-06', 'true', NULL, 'Passport', '11111111', NULL),
(8, 2, 'cardname8', 11111, 'Male', '1970-04-04', '1992-05-17', '2032-12-31', 'true', NULL, 'Driver\'s License', NULL, '111111'),
(9, 2, 'cardname9', 5454545, NULL, '1993-06-06', '2014-11-25', '2035-10-30', 'true', NULL, 'Tax Numbers', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `recieptnumber` int(200) NOT NULL,
  `sno` int(11) NOT NULL,
  `id` int(100) NOT NULL,
  `itemname` varchar(200) DEFAULT NULL,
  `price` int(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`recieptnumber`, `sno`, `id`, `itemname`, `price`) VALUES
(8, 19, 2, 'NewItem1', 4000),
(8, 20, 2, 'new2', 4000),
(8, 21, 2, 'new3', 10),
(8, 23, 2, 'new4', 60),
(9, 24, 2, 'NewItem24', 40000);

-- --------------------------------------------------------

--
-- Table structure for table `paypalcards`
--

CREATE TABLE `paypalcards` (
  `sno` int(100) NOT NULL,
  `id` int(100) NOT NULL,
  `login` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `cardname` varchar(200) NOT NULL,
  `passwordprotected` varchar(100) NOT NULL DEFAULT 'true',
  `note` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `paypalcards`
--

INSERT INTO `paypalcards` (`sno`, `id`, `login`, `password`, `cardname`, `passwordprotected`, `note`) VALUES
(1, 2, 'singh.swaraj1999@gmail.com', '123', 'cardname1', 'true', ''),
(2, 2, '424', '244', 'cardname2', 'true', ''),
(3, 2, '78', '78', 'cardname3', 'true', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `receipts`
--

CREATE TABLE `receipts` (
  `sno` int(11) NOT NULL,
  `id` int(100) NOT NULL,
  `currency` varchar(100) NOT NULL,
  `price` varchar(100) NOT NULL,
  `date` date NOT NULL,
  `place` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `receipts`
--

INSERT INTO `receipts` (`sno`, `id`, `currency`, `price`, `date`, `place`) VALUES
(8, 2, 'USD', '8070', '2018-01-01', 'fb'),
(9, 2, 'USD', '40000', '2018-07-01', 'amazon');

-- --------------------------------------------------------

--
-- Table structure for table `securenotes`
--

CREATE TABLE `securenotes` (
  `id` int(100) NOT NULL,
  `sno` int(100) NOT NULL,
  `note` text NOT NULL,
  `type` varchar(100) NOT NULL,
  `title` varchar(100) NOT NULL,
  `passwordprotected` varchar(100) NOT NULL DEFAULT 'false'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `securenotes`
--

INSERT INTO `securenotes` (`id`, `sno`, `note`, `type`, `title`, `passwordprotected`) VALUES
(2, 1, 'Blank note\nHello\nHi', 'Blank Note', '123', 'true'),
(2, 6, '', 'Blank Note', 'Enter Title For Your Note Here', 'true'),
(2, 7, 'Application:  \n\nApplication path:  \n\n--\n\nLogin:  \n\nPassword:  \n\n--\n\nNotes:  ', 'Application Password', 'Enter Title For Your Note Here', 'true');

-- --------------------------------------------------------

--
-- Table structure for table `usernewdetail`
--

CREATE TABLE `usernewdetail` (
  `sno` int(11) NOT NULL,
  `id` int(100) NOT NULL,
  `Title` varchar(40) NOT NULL,
  `firstname` varchar(200) NOT NULL,
  `middlename` varchar(200) DEFAULT NULL,
  `lastname` varchar(200) NOT NULL,
  `defaultlogin` varchar(200) DEFAULT NULL,
  `dob` varchar(200) NOT NULL,
  `email` varchar(200) NOT NULL,
  `emailtype` varchar(200) NOT NULL,
  `imagename` varchar(600) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usernewdetail`
--

INSERT INTO `usernewdetail` (`sno`, `id`, `Title`, `firstname`, `middlename`, `lastname`, `defaultlogin`, `dob`, `email`, `emailtype`, `imagename`) VALUES
(8, 2, 'Mr.', 'robot', '', '', 'root', '19-02-1999', 'root', 'Personal', 'default.jpg'),
(9, 2, 'Mr.', '123', '123', '123', '123', '123', '123', 'Personal', 'default.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(100) NOT NULL,
  `userEmail` varchar(100) NOT NULL,
  `userPass` varchar(100) NOT NULL,
  `phoneNo` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `userEmail`, `userPass`, `phoneNo`) VALUES
(1, 'singh.swaraj1999@gmail.com', '123', 0),
(2, 'root', 'root', 567),
(3, 'a', 'a', NULL),
(4, 'root1', 'root1', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addedpasscat`
--
ALTER TABLE `addedpasscat`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `bankcards`
--
ALTER TABLE `bankcards`
  ADD PRIMARY KEY (`sno`);

--
-- Indexes for table `category_table`
--
ALTER TABLE `category_table`
  ADD PRIMARY KEY (`category`);

--
-- Indexes for table `creditcards`
--
ALTER TABLE `creditcards`
  ADD PRIMARY KEY (`sno`);

--
-- Indexes for table `details`
--
ALTER TABLE `details`
  ADD PRIMARY KEY (`sno`);

--
-- Indexes for table `idcards`
--
ALTER TABLE `idcards`
  ADD PRIMARY KEY (`sno`);

--
-- Indexes for table `items`
--
ALTER TABLE `items`
  ADD PRIMARY KEY (`sno`);

--
-- Indexes for table `paypalcards`
--
ALTER TABLE `paypalcards`
  ADD PRIMARY KEY (`sno`);

--
-- Indexes for table `receipts`
--
ALTER TABLE `receipts`
  ADD PRIMARY KEY (`sno`);

--
-- Indexes for table `securenotes`
--
ALTER TABLE `securenotes`
  ADD PRIMARY KEY (`sno`);

--
-- Indexes for table `usernewdetail`
--
ALTER TABLE `usernewdetail`
  ADD PRIMARY KEY (`sno`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bankcards`
--
ALTER TABLE `bankcards`
  MODIFY `sno` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `creditcards`
--
ALTER TABLE `creditcards`
  MODIFY `sno` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `details`
--
ALTER TABLE `details`
  MODIFY `sno` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
--
-- AUTO_INCREMENT for table `idcards`
--
ALTER TABLE `idcards`
  MODIFY `sno` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `items`
--
ALTER TABLE `items`
  MODIFY `sno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
--
-- AUTO_INCREMENT for table `paypalcards`
--
ALTER TABLE `paypalcards`
  MODIFY `sno` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `receipts`
--
ALTER TABLE `receipts`
  MODIFY `sno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `securenotes`
--
ALTER TABLE `securenotes`
  MODIFY `sno` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `usernewdetail`
--
ALTER TABLE `usernewdetail`
  MODIFY `sno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
