/*
 * Copyright 2025 IQKV Team.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.iqkv.incubator.sample.mixbookingdb.dashboard.config;

import com.iqkv.incubator.sample.mixbookingdb.jobs.annotation.EnableJobSupport;
import com.iqkv.incubator.sample.mixbookingdb.persistence.annotation.EnableBookingPersistence;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableJobSupport
@EnableBookingPersistence
@OpenAPIDefinition(info = @Info(title = "Bookingdb Dashboard API", version = "25.0.0"))
class ApplicationConfig {
}
