-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 31, 2022 at 07:23 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_books_tp1dpbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `tauthors`
--

CREATE TABLE `tauthors` (
  `id` int(11) NOT NULL,
  `img` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jumlah_buku` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tauthors`
--

INSERT INTO `tauthors` (`id`, `img`, `nama`, `jumlah_buku`) VALUES
(1, 'https://i.imgur.com/Os2ADth.png', 'Giga Chad', 12),
(2, 'https://i.imgur.com/Si2iqnD.jpeg', 'Dio Brando', 11),
(5, 'https://i.imgur.com/4jdJv5y.png', 'Giorno Giovanna', 14);

-- --------------------------------------------------------

--
-- Table structure for table `tbooks`
--

CREATE TABLE `tbooks` (
  `id` int(11) NOT NULL,
  `img` varchar(50) NOT NULL,
  `penerbit` varchar(50) NOT NULL,
  `author` varchar(50) NOT NULL,
  `deskripsi` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbooks`
--

INSERT INTO `tbooks` (`id`, `img`, `penerbit`, `author`, `deskripsi`) VALUES
(1, 'https://i.imgur.com/yaJNMNy.jpeg', 'J-Novel Club', 'Yuri Kitayama', 'After a tense verbal standoff, Liselotte Cretia of the Galarc Kingdom is abducted by the sixth hero,'),
(2, 'https://i.imgur.com/bQaZMHA.jpeg', 'Yen Press', 'Hiromu', 'It’s hard to beat Saku Chitose. The most popular kid in his high school? Check. An ironclad reputati'),
(3, 'https://i.imgur.com/G20NdWl.jpeg', 'Yen Press', 'Saekisan', 'Angel next door spoils me rotten');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tauthors`
--
ALTER TABLE `tauthors`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbooks`
--
ALTER TABLE `tbooks`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tauthors`
--
ALTER TABLE `tauthors`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbooks`
--
ALTER TABLE `tbooks`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
