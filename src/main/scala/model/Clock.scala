package model

final case class Clock(timestamp: String,
    is_open: Boolean,
    next_open: String,
    next_close: String
)