package com.vimeo.networking2

import com.vimeo.networking2.common.ReportableInteractions

/**
 * All action that can be taken on a video.
 */
data class VideoInteractions(

    /**
     * The buy interaction for a On Demand video.
     */
    val buy: BuyInteraction? = null,

    /**
     * When a video is referenced by a channel URI, if the user is a moderator of the
     * channel, include information about removing the video from the channel.
     */
    val channel: BasicInteraction? = null,

    /**
     * Information about whether the authenticated user has liked this video.
     */
    val like: LikeInteraction? = null,

    /**
     * The Rent interaction for an On Demand video.
     */
    val rent: RentInteraction? = null,

    /**
     * Information about where and how to report a video.
     */
    override val report: BasicInteraction? = null,

    /**
     * Subscription information for an On Demand video.
     */
    val subscription: SubscriptionInteraction? = null,

    /**
     * Information about removing this video from the user's list of watched videos.
     */
    val watched: WatchedInteraction? = null,

    /**
     * Information about whether this video appears on the authenticated user's Watch Later list.
     */
    val watchLater: WatchLaterInteraction? = null

): ReportableInteractions
