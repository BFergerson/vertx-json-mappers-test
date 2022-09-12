package test

import java.time.Instant

object TestMarshaller {
    @JvmStatic
    fun serializeInstant(value: Instant): String {
        return value.toEpochMilli().toString()
    }

    @JvmStatic
    fun deserializeInstant(value: String): Instant {
        return Instant.ofEpochMilli(value.toLong())
    }
}
