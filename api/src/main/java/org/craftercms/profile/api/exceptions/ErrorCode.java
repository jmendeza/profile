/*
 * Copyright (C) 2007-2020 Crafter Software Corporation. All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.craftercms.profile.api.exceptions;

/**
 * Contains profile's error codes.
 *
 * @author avasquez
 */
public enum ErrorCode {
    ACCESS_TOKEN_EXISTS,
    NO_SUCH_ACCESS_TOKEN_ID,
    ACCESS_DENIED,
    ACTION_DENIED,
    NO_SUCH_TENANT,
    BAD_CREDENTIALS,
    DISABLED_PROFILE,
    NO_SUCH_PROFILE,
    NO_SUCH_TICKET,
    NO_SUCH_PERSISTENT_LOGIN,
    NO_SUCH_VERIFICATION_TOKEN,
    INVALID_EMAIL_ADDRESS,
    PERMISSION_ERROR,
    ATTRIBUTE_ALREADY_DEFINED,
    ATTRIBUTE_NOT_DEFINED,
    PARAM_DESERIALIZATION_ERROR,
    TENANT_EXISTS,
    PROFILE_EXISTS,
    INVALID_QUERY,
    OTHER;
}
