-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 01, 2018 at 01:05 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `apcudatabase`
--

-- --------------------------------------------------------

--
-- Table structure for table `cmatch`
--

CREATE TABLE `cmatch` (
  `TournamentID` int(11) NOT NULL,
  `CMatchID` int(11) NOT NULL,
  `MatchType` varchar(50) NOT NULL,
  `BallType` varchar(50) NOT NULL,
  `Date` varchar(50) NOT NULL,
  `Time` varchar(50) NOT NULL,
  `LocationType` varchar(50) NOT NULL,
  `GroundID` int(11) NOT NULL,
  `Description` varchar(50) NOT NULL DEFAULT 'N/A'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cmatch`
--

INSERT INTO `cmatch` (`TournamentID`, `CMatchID`, `MatchType`, `BallType`, `Date`, `Time`, `LocationType`, `GroundID`, `Description`) VALUES
(1, 2, 'One Day', 'White', '01-05-2017', '10:45 AM', 'Colombo', 3, 'aaa'),
(2, 3, 'Twenty Twenty', 'Red', '23-07-2017', '09:00 AM', 'Colombo', 4, 'N/A'),
(1, 4, 'One Day', 'White', '01-05-2017', '10:45 AM', 'Colombo', 3, 'N/A'),
(1, 5, 'One Day', 'White', '01-05-2017', '12:45 AM', 'Colombo', 4, 'N/A'),
(1, 6, 'Test', 'Red', '01-05-2017', '10:45 PM', 'Out Station', 4, 'N/A'),
(1, 7, 'One Day', 'White', '01-05-2017', '10:45 AM', 'Colombo', 3, 'N/A'),
(1, 8, 'One Day', 'White', '17-05-2017', '10:45 AM', 'Out Station', 4, 'N/A'),
(1, 9, 'Test', 'White', '01-05-2017', '07:31 AM', 'Colombo', 3, 'N/A'),
(1, 10, 'One Day', 'Red', '21-12-2017', '01:12 PM', 'Out Station', 3, 'N/A'),
(16, 11, 'One Day', 'Red', '02-05-2017', '01:00 PM', 'Colombo', 3, 'N/A'),
(15, 12, 'One Day', 'White', '02-05-2017', '01:00 PM', 'Colombo', 3, 'N/A');

-- --------------------------------------------------------

--
-- Table structure for table `contactpersontelephone`
--

CREATE TABLE `contactpersontelephone` (
  `TournamentID` int(11) NOT NULL,
  `Telephone` varchar(15) NOT NULL,
  `Count` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `contactpersontelephone`
--

INSERT INTO `contactpersontelephone` (`TournamentID`, `Telephone`, `Count`) VALUES
(1, '0000000000', 2),
(1, '8888888888', 1),
(2, '898980987', 1),
(3, '0000000000', 2),
(3, '1234543434', 1),
(4, '4545454656', 1),
(9, '7898765456', 1),
(9, '9876787678', 2),
(10, '0987676543', 1),
(11, '0909090909', 1),
(12, '0000000000', 1),
(13, '0000000000', 2),
(13, '8888888888', 1),
(14, '0000000000', 2),
(14, '8888888888', 1),
(15, '0000000000', 2),
(15, '8888888888', 1),
(16, '0000000000', 2),
(16, '8888888888', 1),
(17, '0000000000', 2),
(17, '8888888888', 1);

-- --------------------------------------------------------

--
-- Table structure for table `ground`
--

CREATE TABLE `ground` (
  `GroundID` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Telephone` varchar(15) NOT NULL,
  `Availability` varchar(50) NOT NULL DEFAULT 'Available'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ground`
--

INSERT INTO `ground` (`GroundID`, `Name`, `Address`, `Telephone`, `Availability`) VALUES
(1, 'a', 'a', '6767687879', 'Not Available'),
(2, 'b', 'bb', '4565656565', 'Not Available'),
(3, 'x', 'x', '6767687879', 'Available'),
(4, 'q', 'qe', '1234567676', 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `loginhistory`
--

CREATE TABLE `loginhistory` (
  `RecordID` int(11) NOT NULL,
  `UserID` int(11) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Type` varchar(15) NOT NULL,
  `Date&Time` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `ppayment`
--

CREATE TABLE `ppayment` (
  `PPaymentID` int(11) NOT NULL,
  `Position` varchar(50) NOT NULL,
  `PAmount` int(11) NOT NULL,
  `CMatchID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ppayment`
--

INSERT INTO `ppayment` (`PPaymentID`, `Position`, `PAmount`, `CMatchID`) VALUES
(1, 'Third Umpire', 10050, 5),
(2, 'Scorer', 10000, 5),
(5, 'Third Umpire', 30000, 5),
(6, 'Standby Umpire', 10000, 5),
(7, 'Umpire', 345, 5),
(8, 'Scorer', 30, 2),
(9, 'Scorer', 123, 11);

-- --------------------------------------------------------

--
-- Table structure for table `rpayment`
--

CREATE TABLE `rpayment` (
  `RPaymentID` int(11) NOT NULL,
  `TournamentID` int(11) NOT NULL,
  `RPaymentDate` varchar(15) NOT NULL,
  `RAmount` int(11) NOT NULL,
  `PaymentMethod` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rpayment`
--

INSERT INTO `rpayment` (`RPaymentID`, `TournamentID`, `RPaymentDate`, `RAmount`, `PaymentMethod`) VALUES
(19, 2, '16-01-2018', 50, 'Cash'),
(20, 2, '16-01-2018', 50, 'Cash'),
(21, 2, '16-01-2018', 100, 'Cash'),
(22, 2, '18-01-2018', 50, 'Cash'),
(23, 12, '19-01-2018', 100, 'Cash'),
(24, 2, '16-01-2018', 100, 'Cash'),
(25, 2, '16-01-2018', 75, 'Cash'),
(26, 2, '20-01-2018', 80, 'Cash'),
(27, 1, '24-01-2018', 5555, 'Cash'),
(28, 1, '22-01-2018', 100, 'Cash'),
(29, 1, '24-01-2018', 100, 'Cash'),
(30, 1, '24-01-2018', 49800, 'Cash'),
(31, 3, '22-01-2018', 20000, 'Cash'),
(32, 3, '22-01-2018', 10000, 'Cash'),
(33, 4, '14-02-2018', 10050, 'Cheque'),
(34, 10, '19-02-2018', 20000, 'Cheque'),
(35, 12, '13-02-2018', 1000, 'Cash'),
(36, 12, '13-02-2018', 900, 'Cash'),
(37, 13, '14-02-2018', 5555, 'Cash'),
(38, 13, '14-02-2018', 100, 'Cash');

-- --------------------------------------------------------

--
-- Table structure for table `scorer`
--

CREATE TABLE `scorer` (
  `ScorerID` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `DOB` varchar(15) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `AccountNo` varchar(50) NOT NULL,
  `BankBranch` varchar(50) NOT NULL,
  `Availability` varchar(50) NOT NULL DEFAULT 'Available'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `scorer`
--

INSERT INTO `scorer` (`ScorerID`, `Name`, `DOB`, `Address`, `Email`, `AccountNo`, `BankBranch`, `Availability`) VALUES
(5, 'Nimal Perera', '10-05-1982', 'Kandy', 'Nimal@gmail.com', '1234354678', 'Bank of Ceylon Kandy', 'Not Available'),
(6, 'Heshan Fernando', '16-09-1973', 'Colombo', 'Heshan@ymail.com', '8965434324', 'Commercial Bank Colombo', 'Available'),
(7, 'Vimal Fernado', '08-12-1987', 'Colombo', 'Vimal@gmail.com', '8989898096', 'Commercial Bank Colombo', 'Available'),
(8, 'Heshan Fernando', '16-09-1973', 'Colombo', 'Heshan@ymail.com', '8965434324', 'Commercial Bank Colombo', 'Available'),
(9, 'xxxxx', '16-09-1973', 'Colombo', 'Heshan@ymail.com', '8965434324', 'Commercial Bank Colombo', 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `scorerallocation`
--

CREATE TABLE `scorerallocation` (
  `ScorerID` int(11) NOT NULL,
  `CMatchID` int(11) NOT NULL,
  `PPaymentStatus` varchar(50) NOT NULL DEFAULT 'Not Settled',
  `PPaymentDate` varchar(15) NOT NULL DEFAULT 'N/A'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `scorerallocation`
--

INSERT INTO `scorerallocation` (`ScorerID`, `CMatchID`, `PPaymentStatus`, `PPaymentDate`) VALUES
(5, 2, 'Not Settled', 'N/A'),
(5, 11, 'Settled', '25-01-2018'),
(6, 2, 'Not Settled', 'N/A'),
(6, 12, 'Not Settled', 'N/A'),
(7, 2, 'Not Settled', 'N/A'),
(7, 3, 'Not Settled', 'N/A'),
(8, 5, 'Settled', '15-01-2018'),
(9, 5, 'Settled', '24-01-2018');

-- --------------------------------------------------------

--
-- Table structure for table `scorertelephone`
--

CREATE TABLE `scorertelephone` (
  `ScorerID` int(11) NOT NULL,
  `Telephone` varchar(15) NOT NULL,
  `Count` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `scorertelephone`
--

INSERT INTO `scorertelephone` (`ScorerID`, `Telephone`, `Count`) VALUES
(5, '0316789874', 1),
(5, '0712343218', 2),
(6, '0876754563', 1),
(7, '4546576878', 1),
(8, '0876754563', 1),
(9, '0876754563', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tournament`
--

CREATE TABLE `tournament` (
  `TournamentID` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `StartDate` varchar(15) NOT NULL,
  `EndDate` varchar(15) NOT NULL,
  `ContactPerson` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `RPaymentStatus` varchar(50) NOT NULL DEFAULT 'Not Settled',
  `TotalAmount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tournament`
--

INSERT INTO `tournament` (`TournamentID`, `Name`, `StartDate`, `EndDate`, `ContactPerson`, `Address`, `Email`, `RPaymentStatus`, `TotalAmount`) VALUES
(1, 'u', '01-05-2017', '10-05-2017', 'u', 'u', 'u@', 'Settled', 5000000),
(2, 'Match', '23-07-2017', '39-07-2017', 'Nimal Fernando', 'Kandy', 'Nimal@gmail.com', 'Not Settled', 20000),
(3, 'Match', '10-05-2017', '13-05-2017', 'M. Perera', 'Colombo', 'Perera@ymail.com', 'Settled', 30000),
(4, 'Match', '23-07-2017', '39-07-2017', 'Nimal Fernando', 'Kandy', 'Nimal@gmail.com', 'Not Settled', 20000),
(10, 'Match', '09-10-2017', '13-10-2017', 'Sunil Fernando', 'Kandy', 'Sunil@gmail.com', 'Not Settled', 90000),
(12, 'c', '10-05-2017', '13-05-2017', 'M. Perera', 'Colombo', 'Perera@ymail.com', 'Not Settled', 30000),
(13, 'u', '01-05-2017', '10-05-2017', 'u', 'u', 'u@', 'Not Settled', 55555),
(14, 'xxxxxx', '01-05-2017', '10-05-2017', 'u', 'u', 'u@', 'Not Settled', 55555),
(15, 'u', '01-05-2017', '10-05-2017', 'u', 'u', 'u@', 'Not Settled', 55555),
(16, 'u', '01-05-2017', '10-05-2017', 'u', 'u', 'u@', 'Not Settled', 55555),
(17, 'u', '01-05-2017', '10-05-2017', 'u', 'u', 'u@', 'Not Settled', 0);

-- --------------------------------------------------------

--
-- Table structure for table `umpire`
--

CREATE TABLE `umpire` (
  `UmpireID` int(11) NOT NULL,
  `Grade` varchar(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `DOB` varchar(15) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `AccountNo` varchar(50) NOT NULL,
  `BankBranch` varchar(50) NOT NULL,
  `Availability` varchar(50) NOT NULL DEFAULT 'Available'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `umpire`
--

INSERT INTO `umpire` (`UmpireID`, `Grade`, `Name`, `DOB`, `Address`, `Email`, `AccountNo`, `BankBranch`, `Availability`) VALUES
(10, 'aaaa', 'Sunil Fernando', '11-06-1967', 'Colombo', 'Sunil@ymail.com', '1234546576', 'Syaln Bank Negombo', 'Available'),
(11, 'aaaa', 'Kamal Peris', '16-12-1970', 'Watthala', 'Kamal@gmail.com', '4567687987', 'Commercial Bank Colombo', 'Available'),
(12, 'aaaa', 'Naveen De Silva', '04-06-1967', 'Gall', 'Naveen@gmail.com', '7879809097', 'People Bank Gall', 'Available'),
(13, 'aaaa', 'Naveen De Silva', '04-06-1967', 'Gall', 'Naveen@gmail.com', '7879809097', 'People Bank Gall', 'Available'),
(14, 'aaaa', 'test', '16-12-1970', 'Watthala', 'Kamal@gmail.com', '4567687987', 'Commercial Bank Colombo', 'Available'),
(15, 'aaaa', 'Fernando', '11-06-1967', 'Colombo', 'Sunil@ymail.com', '1234546576', 'Syaln Bank Negombo', 'Available'),
(16, 'aaaa', 'xxx', '11-06-1967', 'Colombo', 'Sunil@ymail.com', '1234546576', 'Syaln Bank Negombo', 'Available'),
(17, 'aaaa', 'yyyy', '16-12-1970', 'Watthala', 'Kamal@gmail.com', '4567687987', 'Commercial Bank Colombo', 'Available'),
(18, 'aaaa', 'vvvvv', '11-06-1967', 'Colombo', 'Sunil@ymail.com', '1234546576', 'Syaln Bank Negombo', 'Available'),
(19, 'aaaa', 'zzzzz', '11-06-1967', 'Colombo', 'Sunil@ymail.com', '1234546576', 'Syaln Bank Negombo', 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `umpireallocation`
--

CREATE TABLE `umpireallocation` (
  `UmpireID` int(11) NOT NULL,
  `UmpireType` varchar(50) NOT NULL,
  `CMatchID` int(11) NOT NULL,
  `PPaymentStatus` varchar(50) NOT NULL DEFAULT 'Not Settled',
  `PPaymentDate` varchar(15) NOT NULL DEFAULT 'N/A'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `umpireallocation`
--

INSERT INTO `umpireallocation` (`UmpireID`, `UmpireType`, `CMatchID`, `PPaymentStatus`, `PPaymentDate`) VALUES
(10, 'Umpire', 3, 'Not Settled', 'N/A'),
(10, 'Umpire', 4, 'Not Settled', 'N/A'),
(11, 'Third Umpire', 2, 'Not Settled', 'N/A'),
(11, 'Third Umpire', 3, 'Not Settled', 'N/A'),
(12, 'Umpire', 2, 'Not Settled', 'N/A'),
(14, 'Third Umpire', 5, 'Settled', '22-01-2018'),
(16, 'Umpire', 5, 'Settled', '23-01-2018'),
(17, 'Third Umpire', 5, 'Not Settled', 'N/A'),
(18, 'Standby Umpire', 5, 'Settled', '24-01-2018'),
(19, 'Standby Umpire', 5, 'Not Settled', 'N/A');

-- --------------------------------------------------------

--
-- Table structure for table `umpiretelephone`
--

CREATE TABLE `umpiretelephone` (
  `UmpireID` int(11) NOT NULL,
  `Telephone` varchar(15) NOT NULL,
  `Count` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `umpiretelephone`
--

INSERT INTO `umpiretelephone` (`UmpireID`, `Telephone`, `Count`) VALUES
(10, '0118907892', 1),
(11, '0112343454', 1),
(11, '0776784562', 2),
(12, '0376564533', 1),
(12, '0757687890', 2),
(13, '0376564533', 1),
(14, '0112343454', 1),
(14, '0776784562', 2),
(15, '0118907892', 1),
(16, '0118907892', 1),
(17, '0112343454', 1),
(17, '0776784562', 2),
(18, '0118907892', 1),
(19, '0118907892', 1);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `UserID` int(11) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Type` varchar(15) NOT NULL,
  `status` varchar(15) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`UserID`, `Username`, `Password`, `Type`, `status`) VALUES
(2, 'test', 'test', 'User', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cmatch`
--
ALTER TABLE `cmatch`
  ADD PRIMARY KEY (`CMatchID`),
  ADD KEY `MatchFkGroundID` (`GroundID`),
  ADD KEY `contactpersontelephoneFkTournamentID` (`TournamentID`);

--
-- Indexes for table `contactpersontelephone`
--
ALTER TABLE `contactpersontelephone`
  ADD PRIMARY KEY (`TournamentID`,`Telephone`);

--
-- Indexes for table `ground`
--
ALTER TABLE `ground`
  ADD PRIMARY KEY (`GroundID`);

--
-- Indexes for table `loginhistory`
--
ALTER TABLE `loginhistory`
  ADD PRIMARY KEY (`RecordID`),
  ADD KEY `fk_uid` (`UserID`);

--
-- Indexes for table `ppayment`
--
ALTER TABLE `ppayment`
  ADD PRIMARY KEY (`PPaymentID`),
  ADD KEY `ppaymentFkcmatch` (`CMatchID`);

--
-- Indexes for table `rpayment`
--
ALTER TABLE `rpayment`
  ADD PRIMARY KEY (`RPaymentID`),
  ADD KEY `rpaymentFkTournamentID` (`TournamentID`);

--
-- Indexes for table `scorer`
--
ALTER TABLE `scorer`
  ADD PRIMARY KEY (`ScorerID`);

--
-- Indexes for table `scorerallocation`
--
ALTER TABLE `scorerallocation`
  ADD PRIMARY KEY (`ScorerID`,`CMatchID`),
  ADD KEY `ScorerFkCMatchID` (`CMatchID`);

--
-- Indexes for table `scorertelephone`
--
ALTER TABLE `scorertelephone`
  ADD PRIMARY KEY (`ScorerID`,`Telephone`);

--
-- Indexes for table `tournament`
--
ALTER TABLE `tournament`
  ADD PRIMARY KEY (`TournamentID`);

--
-- Indexes for table `umpire`
--
ALTER TABLE `umpire`
  ADD PRIMARY KEY (`UmpireID`);

--
-- Indexes for table `umpireallocation`
--
ALTER TABLE `umpireallocation`
  ADD PRIMARY KEY (`UmpireID`,`CMatchID`);

--
-- Indexes for table `umpiretelephone`
--
ALTER TABLE `umpiretelephone`
  ADD PRIMARY KEY (`UmpireID`,`Telephone`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`UserID`),
  ADD UNIQUE KEY `Username` (`Username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cmatch`
--
ALTER TABLE `cmatch`
  MODIFY `CMatchID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `ground`
--
ALTER TABLE `ground`
  MODIFY `GroundID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `loginhistory`
--
ALTER TABLE `loginhistory`
  MODIFY `RecordID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `ppayment`
--
ALTER TABLE `ppayment`
  MODIFY `PPaymentID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `rpayment`
--
ALTER TABLE `rpayment`
  MODIFY `RPaymentID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;
--
-- AUTO_INCREMENT for table `scorer`
--
ALTER TABLE `scorer`
  MODIFY `ScorerID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `tournament`
--
ALTER TABLE `tournament`
  MODIFY `TournamentID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
--
-- AUTO_INCREMENT for table `umpire`
--
ALTER TABLE `umpire`
  MODIFY `UmpireID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `cmatch`
--
ALTER TABLE `cmatch`
  ADD CONSTRAINT `MatchFkGroundID` FOREIGN KEY (`GroundID`) REFERENCES `ground` (`GroundID`),
  ADD CONSTRAINT `MatchFkTournamentID` FOREIGN KEY (`TournamentID`) REFERENCES `tournament` (`TournamentID`),
  ADD CONSTRAINT `contactpersontelephoneFkTournamentID` FOREIGN KEY (`TournamentID`) REFERENCES `tournament` (`TournamentID`);

--
-- Constraints for table `ppayment`
--
ALTER TABLE `ppayment`
  ADD CONSTRAINT `ppaymentFkcmatch` FOREIGN KEY (`CMatchID`) REFERENCES `cmatch` (`CMatchID`);

--
-- Constraints for table `rpayment`
--
ALTER TABLE `rpayment`
  ADD CONSTRAINT `rpaymentFkTournamentID` FOREIGN KEY (`TournamentID`) REFERENCES `tournament` (`TournamentID`);

--
-- Constraints for table `scorerallocation`
--
ALTER TABLE `scorerallocation`
  ADD CONSTRAINT `ScorerFkCMatchID` FOREIGN KEY (`CMatchID`) REFERENCES `cmatch` (`CMatchID`),
  ADD CONSTRAINT `ScorerFkSocrerID` FOREIGN KEY (`ScorerID`) REFERENCES `scorer` (`ScorerID`),
  ADD CONSTRAINT `scorerFkscorerID` FOREIGN KEY (`ScorerID`) REFERENCES `scorer` (`ScorerID`);

--
-- Constraints for table `scorertelephone`
--
ALTER TABLE `scorertelephone`
  ADD CONSTRAINT `scorertelephoneFK` FOREIGN KEY (`ScorerID`) REFERENCES `scorer` (`ScorerID`);

--
-- Constraints for table `umpiretelephone`
--
ALTER TABLE `umpiretelephone`
  ADD CONSTRAINT `umpiretelephoneFK` FOREIGN KEY (`UmpireID`) REFERENCES `umpire` (`UmpireID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
