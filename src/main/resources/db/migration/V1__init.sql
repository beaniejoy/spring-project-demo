CREATE TABLE `user` (
                        `user_id` int NOT NULL AUTO_INCREMENT,
                        `user_name` varchar(50)  NOT NULL,
                        `email` varchar(50) NOT NULL,
                        `password` varchar(500) NOT NULL,
                        `address` varchar(100) NOT NULL,
                        `phone_number` varchar(11) NOT NULL,
                        `seller` tinyint(1) NOT NULL,
                        `role_type` varchar(10) NOT NULL,
                        `salt` varchar(20) NOT NULL,
                        PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE `company` (
                           `id` bigint NOT NULL AUTO_INCREMENT,
                           `company_name` varchar(128) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                           `company_address` varchar(128) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE `employee` (
                            `id` bigint NOT NULL AUTO_INCREMENT,
                            `company_id` bigint DEFAULT NULL,
                            `employee_name` varchar(128) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                            `employee_address` varchar(128) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                            PRIMARY KEY (`id`),
                            KEY `company_id` (`company_id`),
                            FOREIGN KEY (`company_id`) REFERENCES `company` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;