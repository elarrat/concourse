/*
 * Copyright (c) 2013-2021 Cinchapi Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cinchapi.concourse.server.storage;

/**
 * An internal exception that indicates that an action violates referential
 * integrity.
 *
 * @author Jeff Nelson
 */
class ReferentialIntegrityException extends RuntimeException {

    private static final long serialVersionUID = 1921936211007486710L;

    /**
     * Construct a new instance.
     * 
     * @param message
     */
    ReferentialIntegrityException(String message) {
        super(message);
    }

}