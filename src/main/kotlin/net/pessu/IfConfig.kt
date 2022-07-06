package net.pessu

import com.fasterxml.jackson.annotation.JsonProperty

data class IfConfig(
  @JsonProperty("ip") val ip: String = "",
  @JsonProperty("ip_decimal") val ip_decimal: Long = 0L,
  @JsonProperty("country") val country: String = "",
  @JsonProperty("country_iso") val country_iso: String = "",
  @JsonProperty("country_eu") val country_eu: Boolean = true,
  @JsonProperty("region_name") val region_name: String = "",
  @JsonProperty("region_code") val region_code: String = "",
  @JsonProperty("zip_code") val zip_code: String = "",
  @JsonProperty("city") val city: String = "",
  @JsonProperty("latitude") val latitude: Double = 0.0,
  @JsonProperty("longitude") val longitude: Double = 0.0,
  @JsonProperty("time_zone") val time_zone: String = "",
  @JsonProperty("asn") val asn: String = "",
  @JsonProperty("asn_org") val asn_org: String = ""
)
