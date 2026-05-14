SUMMARY = "Linux driver for RTL8811AU and RTL8821AU chipsets"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1918d7d89f091725a3188ff95f7c72b"
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

inherit module

SRC_URI = " \
	git://github.com/EmbeddedAndroid/8821au-20210708.git;protocol=https;branch=embeddedandroid \
	file://0001-Use-modules_install-as-wanted-by-yocto.patch \
"

# Track an EmbeddedAndroid fork of morrownr/8821au-20210708. The
# 'embeddedandroid' branch starts from upstream commit 250cdad
# (Sep 2025) -- the last good revision before upstream PR #198
# introduced an undefined _FW_UNDER_SURVEY identifier -- and
# carries kernel 6.16/6.17/6.18 compat patches on top.
SRCREV = "74af5d63e0b6dffbf111259472844f8f228c6e3b"
PV = "5.12.5.2-git+2026.05"

S = "${WORKDIR}/git"

EXTRA_OEMAKE:append = " KSRC=${STAGING_KERNEL_DIR}"
