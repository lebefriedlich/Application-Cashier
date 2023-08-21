-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 21, 2023 at 03:51 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kasir`
--

-- --------------------------------------------------------

--
-- Table structure for table `aktifitas25052023`
--

CREATE TABLE `aktifitas25052023` (
  `waktu_pembelian` time DEFAULT NULL,
  `kode_barang` varchar(7) DEFAULT NULL,
  `nama_barang` varchar(50) DEFAULT NULL,
  `jumlah_barang` int(5) DEFAULT NULL,
  `harga_satuan` int(10) DEFAULT NULL,
  `harga_total` int(10) DEFAULT NULL,
  `diskon` int(3) DEFAULT NULL,
  `totalSetelahDiskon` int(10) DEFAULT NULL,
  `keterangan` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `aktifitas27042023`
--

CREATE TABLE `aktifitas27042023` (
  `waktu_pembelian` time DEFAULT NULL,
  `kode_barang` varchar(7) DEFAULT NULL,
  `nama_barang` varchar(50) DEFAULT NULL,
  `jumlah_barang` int(5) DEFAULT NULL,
  `harga_satuan` int(10) DEFAULT NULL,
  `harga_total` int(10) DEFAULT NULL,
  `diskon` int(3) DEFAULT NULL,
  `totalSetelahDiskon` int(10) DEFAULT NULL,
  `keterangan` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `aktifitas27042023`
--

INSERT INTO `aktifitas27042023` (`waktu_pembelian`, `kode_barang`, `nama_barang`, `jumlah_barang`, `harga_satuan`, `harga_total`, `diskon`, `totalSetelahDiskon`, `keterangan`) VALUES
('06:44:09', 'AAA0001', 'Rokok Surya', 5, 29000, 145000, 0, 145000, 'Barang Dibeli'),
('06:44:09', 'AAA0003', 'Rokok A Mild', 5, 26000, 130000, 0, 130000, 'Barang Dibeli'),
('06:47:16', 'AAA0004', 'Rokok Juara', 5, 20000, 100000, 0, 100000, 'Barang Dibeli'),
('06:48:14', 'AAA0002', 'Rokok Joss', 5, 10000, 50000, 0, 50000, 'Barang Dibeli');

-- --------------------------------------------------------

--
-- Table structure for table `aktifitas28052023`
--

CREATE TABLE `aktifitas28052023` (
  `waktu_pembelian` time DEFAULT NULL,
  `kode_barang` varchar(7) DEFAULT NULL,
  `nama_barang` varchar(50) DEFAULT NULL,
  `jumlah_barang` int(5) DEFAULT NULL,
  `harga_satuan` int(10) DEFAULT NULL,
  `harga_total` int(10) DEFAULT NULL,
  `diskon` int(3) DEFAULT NULL,
  `totalSetelahDiskon` int(10) DEFAULT NULL,
  `keterangan` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `data_barang`
--

CREATE TABLE `data_barang` (
  `no` int(5) NOT NULL,
  `kode_barang` varchar(7) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `stok_barang` int(5) NOT NULL,
  `harga_satuan` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data_barang`
--

INSERT INTO `data_barang` (`no`, `kode_barang`, `nama_barang`, `stok_barang`, `harga_satuan`) VALUES
(2, 'AAA0002', 'Rokok Joss', 18, 10000),
(6, 'AAA0003', 'Rokok A Mild', 35, 26000),
(11, 'AAA0001', 'Rokok Surya', 20, 29000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_barang`
--
ALTER TABLE `data_barang`
  ADD PRIMARY KEY (`no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_barang`
--
ALTER TABLE `data_barang`
  MODIFY `no` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
