/*
 * Copyright 2015 Palantir Technologies, Inc. All rights reserved.
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

package com.palantir.remoting.http;

/**
 * A {@link BackoffStrategy} that attempts the operation exactly once, i.e., returns false always.
 */
public final class NeverRetryingBackoffStrategy implements BackoffStrategy {
    private static final NeverRetryingBackoffStrategy INSTANCE = new NeverRetryingBackoffStrategy();

    private NeverRetryingBackoffStrategy() {}

    public static NeverRetryingBackoffStrategy getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean backoff(int numFailedAttempts) {
        return false;
    }
}
