package client

import model._
import model.request.OrderRequest

import zio._

// import zio.logging.consoleLogger

object AlpacaClient:

  //
  // get config (client secrets, isPaper, etc.)
  //

  //
  // http client
  //

  def getAccount: IO[Error, Account] = ???

  def getAsset(symbol: String): IO[Error, Assets] = ???

  def getAssets(status: Option[String] = None,
                asset_class: Option[String] = None): IO[Error, List[Assets]] = ???

  def getCalendar(start: Option[String] = None,
                  end: Option[String] = None): IO[Error, List[Calendar]] = ???

  def getClock: IO[Error, model.Clock] = ???

  def getOrder(orderId: String): IO[Error, Orders] = ???

  def cancelOrder(orderId: String): Unit = ???

  def cancelAllOrders: Unit = ???

  def getOrders: IO[Error, List[Orders]] = ???

  def placeOrder(orderRequest: OrderRequest): IO[Error, Orders] = ???

  def getPositions: IO[Error, List[Position]] = ???

  def getPosition(symbol: String): IO[Error, Position] = ???

  def closePosition(symbol: String): IO[Error, Orders] = ???

  def closeAllPositions: Unit = ???
