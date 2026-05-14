SUMMARY = "Linux driver for RTL8811AU and RTL8821AU chipsets"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1918d7d89f091725a3188ff95f7c72b"
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

inherit module

SRC_URI = " \
	git://github.com/morrownr/8821au-20210708.git;protocol=https;branch=main \
	file://0001-Use-modules_install-as-wanted-by-yocto.patch \
"

# 250cdad is the last good commit before upstream PR #198 (Apr 2026)
# introduced an undefined _FW_UNDER_SURVEY reference. Includes the
# kernel 6.14 support patch from Apr 2025.
SRCREV = "250cdad41275444b935f788cabae391b9f4d5bc7"
PV = "5.12.5.2-git+2025.09"

S = "${WORKDIR}/git"

EXTRA_OEMAKE:append = " KSRC=${STAGING_KERNEL_DIR}"
