CREATE TABLE `user` (
                        `id` bigint NOT NULL AUTO_INCREMENT,
                        `name` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL,
                        `email` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL,
                        `password` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL,
                        `phone` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                        `address` varchar(256) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE `company` (
                           `id` bigint NOT NULL AUTO_INCREMENT,
                           `company_name` varchar(128) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                           `company_address` varchar(128) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                           PRIMARY KEY (`id`),
                           KEY `idx_company_name` (`company_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE `employee` (
                            `id` bigint NOT NULL AUTO_INCREMENT,
                            `company_id` bigint DEFAULT NULL,
                            `employee_name` varchar(128) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                            `employee_address` varchar(128) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                            PRIMARY KEY (`id`),
                            KEY `idx_employee_name` (`employee_name`),
                            KEY `company_id` (`company_id`),
                            FOREIGN KEY (`company_id`) REFERENCES `company` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;