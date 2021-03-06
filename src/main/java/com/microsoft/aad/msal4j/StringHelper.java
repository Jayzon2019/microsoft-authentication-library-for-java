// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.aad.msal4j;

final class StringHelper {

    public static boolean isBlank(final String str) {
        return str == null || str.trim().length() == 0;
    }
}
