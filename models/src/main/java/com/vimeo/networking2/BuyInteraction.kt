package com.vimeo.networking2

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.vimeo.networking2.common.Interaction
import com.vimeo.networking2.enums.ApiOptionsType
import com.vimeo.networking2.enums.DownloadType
import com.vimeo.networking2.enums.StreamType
import java.util.*

/**
 * The buy interaction for a On Demand video.
 */
@JsonClass(generateAdapter = true)
data class BuyInteraction(

    /**
     * The currency code for the current user's region.
     */
    @Json(name = "currency")
    val currency: String? = null,

    /**
     * Formatted price to display to buy an On Demand video.
     */
    @Json(name = "display_price")
    val displayPrice: String? = null,

    /**
     * The user's download access to this On Demand video
     */
    @Json(name = "download")
    val download: DownloadType? = null,

    /**
     * Whether the video has DRM.
     */
    @Json(name = "drm")
    val drm: Boolean? = null,

    /**
     * The URL to buy the On Demand video on Vimeo.
     */
    @Json(name = "link")
    val link: String? = null,

    /**
     * The numeric value of the price for buying the On Demand video.
     */
    @Json(name = "price")
    val price: String? = null,

    /**
     * The time in ISO 8601 format when the On Demand video was purchased.
     */
    @Json(name = "purchase_time")
    val purchaseTime: Date? = null,

    /**
     * The user's streaming access to this On Demand video.
     */
    @Json(name = "stream")
    val streamType: StreamType? = null,

    @Json(name = "options")
    override val options: List<ApiOptionsType>? = null,

    @Json(name = "uri")
    override val uri: String? = null

): Interaction
