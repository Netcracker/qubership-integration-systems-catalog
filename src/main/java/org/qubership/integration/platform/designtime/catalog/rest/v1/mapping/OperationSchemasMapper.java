/*
 * Copyright 2024-2025 NetCracker Technology Corporation
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

package org.qubership.integration.platform.designtime.catalog.rest.v1.mapping;

import org.qubership.integration.platform.catalog.persistence.configs.entity.system.Operation;
import org.qubership.integration.platform.designtime.catalog.rest.v1.dto.OperationSchemasDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;



@Mapper(componentModel = "spring")
public interface OperationSchemasMapper {

    @Mapping(target = "id", source = "operation.id")
    @Mapping(target = "name", source = "operation.name")
    @Mapping(target = "method", source = "operation.method")
    @Mapping(target = "path", source = "operation.path")
    @Mapping(target = "requestSchema", source = "operation.requestSchema")
    @Mapping(target = "responseSchemas", source = "operation.responseSchemas")
    OperationSchemasDTO toOperationSchemasDTO(Operation operation);

}