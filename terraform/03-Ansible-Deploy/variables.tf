variable "key_name" {
  default = "ind"
}

variable "pvt_key" {
  default = "/home/sri1056249/.ssh/ind.pem"
}

variable "us-east-zones" {
  default = ["us-east-1a", "us-east-1b"]
}

variable "sg-id" {
  default = "sg-01eb4f696ab5fbaac"
}
