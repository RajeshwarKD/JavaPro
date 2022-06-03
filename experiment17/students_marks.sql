-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jun 03, 2022 at 10:10 AM
-- Server version: 8.0.28
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `students_marks`
--
CREATE DATABASE IF NOT EXISTS `students_marks` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;
USE `students_marks`;

-- --------------------------------------------------------

--
-- Table structure for table `students_marks`
--

CREATE TABLE `students_marks` (
  `sid` int NOT NULL,
  `sname` varchar(50) NOT NULL,
  `cpp` int NOT NULL,
  `java` int NOT NULL,
  `python` int NOT NULL,
  `mysql` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `students_marks`
--

INSERT INTO `students_marks` (`sid`, `sname`, `cpp`, `java`, `python`, `mysql`) VALUES
(1, 'Manoj', 80, 74, 69, 54),
(2, 'Rakesh', 98, 25, 68, 74),
(3, 'Abhishek', 79, 87, 58, 69);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `students_marks`
--
ALTER TABLE `students_marks`
  ADD PRIMARY KEY (`sid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `students_marks`
--
ALTER TABLE `students_marks`
  MODIFY `sid` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
