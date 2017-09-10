
/* Class_dd - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.RandomAccessFile;

public final class Class_dd {
	public static final int field_fd_1582 = 117;
	public static final int field_aa_1583 = 154;
	public static final int field_bd_1584 = 30;
	public static final int field_az_1585 = 42;
	public static final int field_d_1586 = 3;
	static final int field_ak_1587 = 3;
	static ClanMember[] field_mq_1588;
	static final int field_mf_1589 = 48;
	public static final String field_n_1590 = "#";
	static int field_j_1591;
	static final int field_al_1592 = 36;
	static int[][] loaded_xteas;

	static void method_cp_void(final Widget widget, final int i) {
		try {
			final Widget widget_0_ = ((widget.parentId * -1405313417) == -1 ? null
					: Class_en.getWidgetByUID(widget.parentId * -1405313417, (short) 19737));
			int i_1_;
			int i_2_;
			if (widget_0_ == null) {
				i_1_ = Boundary.clientWidth * -1236640339;
				i_2_ = Projectile.clientHeight * -1483492575;
			} else {
				i_1_ = widget_0_.onScreenWidth * 1367496319;
				i_2_ = widget_0_.onScreenHeight * -1643237919;
			}
			FriendWidget.method_ck_void(widget, i_1_, i_2_, false, -947803451);
			Class_ep.method_cl_void(widget, i_1_, i_2_, 5824127);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dd.cp()");
		}
	}

	static File openFile(final String string) {
		try {
			if (!Class_de.field_n_1596) {
				throw new RuntimeException("");
			}
			final File file = (File) Class_de.field_z_1604.get(string);
			if (file != null) {
				return file;
			}
			final File file_3_ = new File(Class_de.field_d_1595, string);
			RandomAccessFile randomaccessfile = null;
			File file_4_;
			try {
				final File file_5_ = new File(file_3_.getParent());
				if (!file_5_.exists()) {
					throw new RuntimeException("");
				}
				randomaccessfile = new RandomAccessFile(file_3_, "rw");
				final int i_6_ = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i_6_);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				Class_de.field_z_1604.put(string, file_3_);
				file_4_ = file_3_;
			} catch (final Exception exception) {
				try {
					if (randomaccessfile != null) {
						randomaccessfile.close();
					}
				} catch (final Exception exception_7_) {
					/* empty */
				}
				throw new RuntimeException();
			}
			return file_4_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dd.d()");
		}
	}

	public static final boolean method_z_boolean(final int i) {
		try {
			final KeyFocusListener class_dp = KeyFocusListener.instance;
			synchronized (class_dp) {
				if ((-589726947 * KeyFocusListener.field_cd_1691) == (-924322639 * KeyFocusListener.field_cp_1677)) {
					return false;
				}
				Class_al.field_ce_179 = (KeyFocusListener.field_cx_1690[KeyFocusListener.field_cd_1691 * -589726947])
						* -1551770967;
				Bindable.field_cf_1703 = (KeyFocusListener.field_ch_1692[-589726947 * KeyFocusListener.field_cd_1691]);
				KeyFocusListener.field_cd_1691 = ((((KeyFocusListener.field_cd_1691 * -589726947) + 1) & 0x7f)
						* -142270667);
				return true;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dd.z()");
		}
	}

	static final void method_dg_void(final Widget widget, final int i, final int i_8_, final byte i_9_) {
		try {
			if ((1816546389 * widget.actionType) == 1) {
				Class_dr.method_ce_void(widget.action, "", 24, 0, 0, widget.uid * -560181405, 2111799865);
			}
			if (((widget.actionType * 1816546389) == 2) && !client.isOptionSelected) {
				final String string = Class_bg.method_el_String(widget, (byte) 3);
				if (string != null) {
					Class_dr.method_ce_void(string,
							new StringBuilder(Class_r.colorString(65280)).append(widget.field_de_2658).toString(), 25,
							0, -1, -560181405 * widget.uid, 1487569771);
				}
			}
			if ((widget.actionType * 1816546389) == 3) {
				Class_dr.method_ce_void(MenuText.field_ft_1899, "", 26, 0, 0, -560181405 * widget.uid, 617380212);
			}
			if ((1816546389 * widget.actionType) == 4) {
				Class_dr.method_ce_void(widget.action, "", 28, 0, 0, widget.uid * -560181405, 24719142);
			}
			if ((1816546389 * widget.actionType) == 5) {
				Class_dr.method_ce_void(widget.action, "", 29, 0, 0, -560181405 * widget.uid, -1324886263);
			}
			if (((1816546389 * widget.actionType) == 6) && (client.field_jd_2762 == null)) {
				Class_dr.method_ce_void(widget.action, "", 30, 0, -1, widget.uid * -560181405, -1827655036);
			}
			if ((876728889 * widget.type) == 2) {
				int i_10_ = 0;
				for (int i_11_ = 0; i_11_ < (-1643237919 * widget.onScreenHeight); i_11_++) {
					for (int i_12_ = 0; i_12_ < (1367496319 * widget.onScreenWidth); i_12_++) {
						int i_13_ = (((-533878721 * widget.itemContainerRowPadding) + 32) * i_12_);
						int i_14_ = (i_11_ * ((widget.itemContainerColumnPadding * 305320041) + 32));
						if (i_10_ < 20) {
							i_13_ += widget.field_cj_2610[i_10_];
							i_14_ += widget.field_cb_2611[i_10_];
						}
						if ((i >= i_13_) && (i_8_ >= i_14_) && (i < (i_13_ + 32)) && (i_8_ < (i_14_ + 32))) {
							client.field_gc_2944 = i_10_ * 242972985;
							Class_fn.field_gd_2411 = widget;
							if (widget.itemIds[i_10_] > 0) {
								final ItemComposite itemdef = ItemDefinitions
										.getItemComposite((widget.itemIds[i_10_]) - 1);
								if (((client.selectedOptionType * -1595363093) == 1) && (Class_bk
										.method_f_boolean(Class_db.method_en_int(widget, -1516511598), 1331974031))) {
									if (((widget.uid * -560181405) != (Class_ed.field_ix_2071 * -969794605))
											|| (i_10_ != (-1792623669 * ImageColorModel.field_iu_542))) {
										Class_dr.method_ce_void(MenuText.USE, new StringBuilder(client.field_it_2841)
												.append(" ").append(Class_d.field_g_858).append(" ")
												.append(Class_r.colorString(16748608)).append(itemdef.name).toString(),
												31, 283343397 * itemdef.itemId, i_10_, -560181405 * widget.uid,
												1486315552);
									}
								} else if (client.isOptionSelected && (Class_bk
										.method_f_boolean((Class_db.method_en_int(widget, -1564258967)), 1331974031))) {
									if (((475607145 * GameCanvas.field_ib_2231) & 0x10) == 16) {
										Class_dr.method_ce_void(client.field_in_2845,
												new StringBuilder(client.selectedOption).append(" ")
														.append(Class_d.field_g_858).append(" ")
														.append(Class_r.colorString(16748608)).append(itemdef.name)
														.toString(),
												32, 283343397 * itemdef.itemId, i_10_, -560181405 * widget.uid,
												1554970872);
									}
								} else {
									String[] strings = itemdef.invOptions;

									if (client.field_ja_2858) {
										strings = (Class_ei.method_dr_StringArray(strings, (byte) -7));
									}

									// Drop, empty, destroy, discard options
									if (Class_bk.method_f_boolean(Class_db.method_en_int(widget, -1620809010),
											1331974031)) {
										for (int i_15_ = 4; i_15_ >= 3; i_15_--) {
											if ((strings != null) && (strings[i_15_] != null)) {
												int i_16_;
												if (i_15_ == 3) {
													i_16_ = 36;
												} else {
													i_16_ = 37;
												}
												if (!client.shiftDown)
													Class_dr.method_ce_void(strings[i_15_],
															new StringBuilder(Class_r.colorString(16748608))
																	.append(itemdef.name).toString(),
															i_16_, (itemdef.itemId * 283343397), i_10_,
															(widget.uid * -560181405), 713994892);

											} else if (i_15_ == 4) {
 
												Class_dr.method_ce_void(MenuText.DROP,
														new StringBuilder(Class_r.colorString(16748608))
																.append(itemdef.name).toString(),
														37, (283343397 * itemdef.itemId), i_10_,
														(widget.uid * -560181405), 597266157);

											}
										}
									}
									// 33 option 1, 34, option wear, 35 option 2
									// Last integer does absolutely nothing
									// i_10_ item inventory slot
									// itemdef.field_u_113 is item id
									if (client.shiftDown) {
										Class_dr.method_ce_void("Quick-drop",
												new StringBuilder(Class_r.colorString(16748608))
														.append(itemdef.name).toString(),
												37, (itemdef.itemId * 283343397), i_10_,
												(widget.uid * -560181405), 0);
									}
									if (Class_df.method_m_boolean(Class_db.method_en_int(widget, -1918140938),
											758266600) && !client.shiftDown) {
										Class_dr.method_ce_void(MenuText.USE,
												new StringBuilder(Class_r.colorString(16748608)).append(itemdef.name)
														.toString(),
												38, 283343397 * itemdef.itemId, i_10_, -560181405 * widget.uid,
												1813054112);
									}
									if ((Class_bk.method_f_boolean(Class_db.method_en_int(widget, -1700153324),
											1331974031)) && (strings != null) && !client.shiftDown) {
										for (int i_17_ = 2; i_17_ >= 0; i_17_--) {
											if (strings[i_17_] != null) {
												int i_18_ = 0;
												if (i_17_ == 0) {
													i_18_ = 33;
												}
												if (i_17_ == 1) {
													i_18_ = 34;
												}
												if (i_17_ == 2) {
													i_18_ = 35;
												}
												Class_dr.method_ce_void(strings[i_17_],
														new StringBuilder(Class_r.colorString(16748608))
																.append(itemdef.name).toString(),
														i_18_, (itemdef.itemId * 283343397), i_10_,
														(widget.uid * -560181405), -935748591);
												//System.out.println(""+strings[i_17_]);
											}
										}
									}
									strings = widget.field_cz_2552;
									if (client.field_ja_2858) {
										strings = (Class_ei.method_dr_StringArray(strings, (byte) -13));
									}
									if (strings != null) {
										for (int i_19_ = 4; i_19_ >= 0; i_19_--) {
											if (strings[i_19_] != null) {
												int i_20_ = 0;
												if (i_19_ == 0) {
													i_20_ = 39;
												}
												if (i_19_ == 1) {
													i_20_ = 40;
												}
												if (i_19_ == 2) {
													i_20_ = 41;
												}
												if (i_19_ == 3) {
													i_20_ = 42;
												}
												if (i_19_ == 4) {
													i_20_ = 43;
												}
												Class_dr.method_ce_void(strings[i_19_],
														new StringBuilder(Class_r.colorString(16748608))
																.append(itemdef.name).toString(),
														i_20_, (283343397 * itemdef.itemId), i_10_,
														(widget.uid * -560181405), -1163991558);
												System.out.println("" + strings[i_19_]);
											}
										}
									}

									Class_dr.method_ce_void(MenuText.field_ei_1934,
											new StringBuilder(Class_r.colorString(16748608)).append(itemdef.name)
													.toString(),
											1005, 283343397 * itemdef.itemId, i_10_, -560181405 * widget.uid,
											-1343049049);
								}
							}
						}
						i_10_++;
					}
				}
			}
			if (widget.interactive) {
				if (client.isOptionSelected) {
					final int i_21_ = Class_db.method_en_int(widget, -1675051229);
					final boolean bool = ((i_21_ >> 21) & 0x1) != 0;
					if (bool && (((GameCanvas.field_ib_2231 * 475607145) & 0x20) == 32)) {
						Class_dr.method_ce_void(client.field_in_2845,
								new StringBuilder(client.selectedOption).append(" ").append(Class_d.field_g_858)
										.append(" ").append(widget.interactionOption).toString(),
								58, 0, -2038048459 * widget.field_k_2544, widget.uid * -560181405, -1119618218);
					}
				} else {
					for (int i_22_ = 9; i_22_ >= 5; i_22_--) {
						final String string = Class_r.method_ej_String(widget, i_22_, (byte) 8);
						if (string != null) {
							Class_dr.method_ce_void(string, widget.interactionOption, 1007, 1 + i_22_,
									widget.field_k_2544 * -2038048459, widget.uid * -560181405, 1735017430);
						}
					}
					final String string = Class_bg.method_el_String(widget, (byte) -31);
					if (string != null) {
						Class_dr.method_ce_void(string, widget.interactionOption, 25, 0,
								-2038048459 * widget.field_k_2544, widget.uid * -560181405, 1638219615);
					}
					for (int i_23_ = 4; i_23_ >= 0; i_23_--) {
						final String string_24_ = Class_r.method_ej_String(widget, i_23_, (byte) 44);
						if (string_24_ != null) {
							Class_dr.method_ce_void(string_24_, widget.interactionOption, 57, 1 + i_23_,
									-2038048459 * widget.field_k_2544, -560181405 * widget.uid, 1253607677);
						}
					}
					if (OnDemandNode.method_n_boolean(Class_db.method_en_int(widget, -1391443067), (byte) 28)) {
						Class_dr.method_ce_void(MenuText.CONTINUE, "", 30, 0, widget.field_k_2544 * -2038048459,
								widget.uid * -560181405, 2133712503);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "dd.dg()");
		}
	}

	Class_dd() throws Throwable {
		throw new Error();
	}
}
