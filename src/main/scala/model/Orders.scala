package model

sealed trait Side
case object buy extends Side
case object sell extends Side

sealed trait Type
case object market extends Type
case object limit extends Type
case object stop extends Type
case object stop_limit extends Type

sealed trait TimeInForce
case object day extends TimeInForce
case object gtc extends TimeInForce
case object opg extends TimeInForce
case object cls extends TimeInForce
case object ioc extends TimeInForce
case object fok extends TimeInForce

sealed trait OrderStatus
case object `new` extends OrderStatus
case object partially_filled extends OrderStatus
case object filled extends OrderStatus
case object done_for_day extends OrderStatus
case object canceled extends OrderStatus
case object expired extends OrderStatus
case object accepted extends OrderStatus
case object pending_new extends OrderStatus
case object accepted_for_bidding extends OrderStatus
case object pending_cancel extends OrderStatus
case object stopped extends OrderStatus
case object rejected extends OrderStatus
case object suspended extends OrderStatus
case object calculated extends OrderStatus

final case class Orders(
    id: String,
    client_order_id: String,
    created_at: String,
    updated_at: String,
    submitted_at: String,
    filled_at: Option[String],
    expired_at: Option[String],
    canceled_at: Option[String],
    failed_at: Option[String],
    asset_id: String,
    symbol: String,
    exchange: Option[String],
    asset_class: String,
    qty: String,
    filled_qty: String,
    `type`: Type,
    side: Side,
    time_in_force: TimeInForce,
    limit_price: Option[String],
    stop_price: Option[String],
    filled_avg_price: Option[String],
    status: OrderStatus
)
