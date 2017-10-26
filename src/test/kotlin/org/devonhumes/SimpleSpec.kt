package org.devonhumes

import org.assertj.core.api.Assertions.assertThat
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it

class SimpleSpec : Spek({
    describe("Spek") {
        it("runs") {
            assertThat(true).isEqualTo(false);
        }
    }
})